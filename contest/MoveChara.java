import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.animation.AnimationTimer;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class MoveChara {
    public static final int TYPE_DOWN = 0;
    public static final int TYPE_LEFT = 1;
    public static final int TYPE_RIGHT = 2;
    public static final int TYPE_UP = 3;

    private final String[] directions = { "Down", "Left", "Right", "Up" };
    private final String[] animationNumbers = { "1", "2", "3" };
    private final String pngPathPre = "png/";
    private final String pngPathSuf = ".png";

    private int posX;
    private int posY;
    private int KeyC = 0;
    private MapData mapData;
    private MapGameController mgc;
    MapGameController mc = new MapGameController();


    private Image[][] charaImages;
    private ImageView[] charaImageViews;
    private ImageAnimation[] charaImageAnimations;

    private int charaDirection;

    MoveChara(int startX, int startY, MapData mapData) {
        this.mapData = mapData;
        charaImages = new Image[4][3];
        charaImageViews = new ImageView[4];
        charaImageAnimations = new ImageAnimation[4];

        for (int i = 0; i < 4; i++) {
            charaImages[i] = new Image[3];
            for (int j = 0; j < 3; j++) {
                charaImages[i][j] = new Image(
                pngPathPre + directions[i] + animationNumbers[j] + pngPathSuf);
            }
            charaImageViews[i] = new ImageView(charaImages[i][0]);
            charaImageAnimations[i] = new ImageAnimation(
            charaImageViews[i], charaImages[i]);
        }

        posX = startX;
        posY = startY;

        setCharaDirection(TYPE_RIGHT); // start with right-direction
    }

    // set the cat's direction
    public void setCharaDirection(int cd) {
        charaDirection = cd;
        for (int i = 0; i < 4; i++) {
            if (i == charaDirection) {
                charaImageAnimations[i].start();
            } else {
                charaImageAnimations[i].stop();
            }
        }
    }

    // check whether the cat can move on
    private boolean isMovable(int dx, int dy) {
        if (mapData.getMap(posX + dx, posY + dy) == MapData.TYPE_WALL) {
            return false;
        } else if (mapData.getMap(posX + dx, posY + dy) == MapData.TYPE_SPACE) {
            return true;
        } else if (mapData.getMap(posX + dx, posY + dy) == MapData.TYPE_GOAL) {
            if(getKeyCount()==3){
                return true;
            }else{
                return false;
            }
        } else if (mapData.getMap(posX + dx, posY + dy) == MapData.TYPE_KEY) {
            return true;
        }
        return false;
    }

    // move the cat
    public boolean move(int dx, int dy) {
        if (isMovable(dx, dy)) {
            posX += dx;
            posY += dy;
            System.out.println("chara[X,Y]:" + posX + "," + posY);
            // もし動いた先がゴールならばGame Clearの文字をターミナルに出力する
            if(mapData.getMap(posX,posY) == MapData.TYPE_GOAL){
                try {
                    System.out.println("\n"+"GameClear!"+"\n");
                    StageDB.getMainStage().hide();
                    StageDB.getMainSound().stop();
                    StageDB.getGameClearStage().show();
                    StageDB.getGameClearSound().play();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            //　もし動いた先が鍵ならばカウントを1増やし、持っている鍵の数をターミナルに出力する。
            //  もし持っている鍵の数が3つならゴールに行けることを示唆する
            }else if(mapData.getMap(posX,posY) == MapData.TYPE_KEY){
                KeyCount(1);
                int i = getKeyCount();
                //  鍵を取ったあとの道はすべてTYPE_SPACEにすることで鍵の重複ゲットを防ぐ
                mapData.setMap(posX,posY,MapData.TYPE_SPACE);
                mapData.setImageViews();
                System.out.println("\n"+"Key: "+i+"\n");
                if(getKeyCount()==3){
                    System.out.println("\n"+"You can go to goal"+"\n");
                    int [] Goal = mapData.getGoal();
                    mapData.setMap(Goal[0],Goal[1],MapData.TYPE_GOAL);
                    mapData.setImageViews();
                }
            }
            return true;
        } else {
            return false;
        }
    }
    public void KeyCount(int k) {
        KeyC = KeyC+k;
        return;
    }
    public int getKeyCount(){
        return KeyC;
    }

    // getter: direction of the cat
    public ImageView getCharaImageView() {
        return charaImageViews[charaDirection];
    }

    // getter: x-positon of the cat
    public int getPosX() {
        return posX;
    }

    // getter: y-positon of the cat
    public int getPosY() {
        return posY;
    }

    // Show the cat animation
    private class ImageAnimation extends AnimationTimer {

        private ImageView charaView = null;
        private Image[] charaImages = null;
        private int index = 0;

        private long duration = 500 * 1000000L; // 500[ms]
        private long startTime = 0;

        private long count = 0L;
        private long preCount;
        private boolean isPlus = true;

        public ImageAnimation(ImageView charaView, Image[] images) {
            this.charaView = charaView;
            this.charaImages = images;
            this.index = 0;
        }

        @Override
        public void handle(long now) {
            if (startTime == 0) {
                startTime = now;
            }

            preCount = count;
            count = (now - startTime) / duration;
            if (preCount != count) {
                if (isPlus) {
                    index++;
                } else {
                    index--;
                }
                if (index < 0 || 2 < index) {
                    index = 1;
                    isPlus = !isPlus; // true == !false, false == !true
                }
                charaView.setImage(charaImages[index]);
            }
        }
    }
}
