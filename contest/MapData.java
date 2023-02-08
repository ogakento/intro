import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import java.util.Random;

public class MapData {
    public static final int TYPE_SPACE = 0;
    public static final int TYPE_WALL = 1;
    public static final int TYPE_GOAL = 2;
    public static final int TYPE_LOCK =3;
    public static final int TYPE_KEY = 4;
    private static final String mapImageFiles[] = {
            "png/SPACE.png",
            "png/WALL.png",
            "png/GOAL.png",
            "png/LOCK.png",
            "png/KEY.png"
    };

    private Image[] mapImages;
    private ImageView[][] mapImageViews;
    private int[][] maps;
    private int width; // width of the map
    private int height; // height of the map

    MapData(int x, int y) {
        mapImages = new Image[5];
        mapImageViews = new ImageView[y][x];
        for (int i = 0; i < 5; i ++) {
            mapImages[i] = new Image(mapImageFiles[i]);
        }

        width = x;
        height = y;
        maps = new int[y][x];

        fillMap(MapData.TYPE_WALL);
        digMap(1, 3);
        //getGoalを呼び出してゴール座標を配列Goalに入力し、setMapでゴール画像を適応させる上ゴールの性質をもたせる
        int [] Goal = getGoal();
        setMap(Goal[0],Goal[1],MapData.TYPE_LOCK);

        //getKeyを呼び出してそれぞれ設定した座標にsetMapで鍵の画像を適応させる。
        int[][] Key = getKey();
        for(int i = 0; i < 3; i++) {
            setMap(Key[i][0], Key[i][1], MapData.TYPE_KEY);
        }

        setImageViews();
    }

    // fill two-dimentional arrays with a given number (maps[y][x])
    private void fillMap(int type) {
        for (int y = 0; y < height; y ++) {
            for (int x = 0; x < width; x++) {
                maps[y][x] = type;
            }
        }
    }

    // dig walls for making roads
    private void digMap(int x, int y) {
        setMap(x, y, MapData.TYPE_SPACE);
        int[][] dl = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };
        int[] tmp;

        for (int i = 0; i < dl.length; i ++) {
            int r = (int) (Math.random() * dl.length);
            tmp = dl[i];
            dl[i] = dl[r];
            dl[r] = tmp;
        }

        for (int i = 0; i < dl.length; i ++) {
            int dx = dl[i][0];
            int dy = dl[i][1];
            if (getMap(x + dx * 2, y + dy * 2) == MapData.TYPE_WALL) {
                setMap(x + dx, y + dy, MapData.TYPE_SPACE);
                digMap(x + dx * 2, y + dy * 2);
            }
        }
    }
    //ゴール座標を計算するメソッド
    public int[] getGoal() {
        //まずゴールの候補となる座標の数はランダムなため、配列ではなく可変長のArrayListを作成する
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> Goalx = new ArrayList<>();
        ArrayList<Integer> Goaly = new ArrayList<>();
        //ゴール候補となる座標は大きさ3*3の9マスのうち2マスがSPACEである正方形の中央である
        //またゴール座標は必ず（x,y）=（奇数,奇数）であり、迷路の座標は(0,0)から（20,14）まである
        //そこでまずマップ上にある一つの3*3の正方形中のそれぞれのマスがWALLであるかSPACEであるかを調べる
        //SPACEであれば1、WALLであれば0をarrayに代入し、9マスすべての和が2であればゴール候補であるから、このときの座標をArrayListのGoalx,Goalyにそれぞれ追加する。
        //これをマップ上にある正方形全てで計算する　ただし、一つの正方形で計算したあとarrayの中身をリセットすることを忘れない
        for(int x = 0; x<=9; x++) {
            for(int y = 0; y<=6; y++) {
                for(int m = 0; m <= 2; m++){
                    for(int n = 0; n <= 2; n++){
                        if( getMap(2*x+m, 2*y+n)== MapData.TYPE_SPACE ||getMap(2*x+m, 2*y+n)== MapData.TYPE_LOCK ){
                            array.add(1);
                        }else{
                            array.add(0);
                        }
                    }
                }

                if(array.get(0) + array.get(1) + array.get(2) + array.get(3) + array.get(4) + array.get(5) + array.get(6) + array.get(7)+ array.get(8) == 2){
                    Goalx.add(2*x+1);
                    Goaly.add(2*y+1);
                }
                array.clear();
            }
        }
        //次に複数のゴール座標の中からキャラクターの最初の位置から最も遠い座標を選択する
        //GoalxとGoalyの大きさは必ず同じになるので、今回はGoalxの配列の大きさを取得し、次に述べるfor文に活用する
        //キャラの位置から最も遠い座標は、x座標の二乗とy座標の二乗の和が最も大きい座標であれば良い
        //一番最初に入力されたゴール候補と比べて大きければGoal座標を再定義し、そうでなければ何もしない、という文になっている
        //最後にGoal座標を配列にいれ、return文で複数の変数を返せるようにする
        int lx = Goalx.size();
        int xMax = Goalx.get(0);
        int yMax = Goaly.get(0);
        for(int a = 1; a<lx; a++){
            if((xMax*xMax) + (yMax* yMax) < (Goalx.get(a)*Goalx.get(a)) + (Goaly.get(a)*Goaly.get(a))){
                xMax = Goalx.get(a);
                yMax = Goaly.get(a);
            }
        }

        int [] Goal ={xMax, yMax};
        return Goal;
    }

    //マップ上のSPACEをランダムで3つKEYに置き換える
    //この際、マップ上のキャラの初期座標(1,1)とかぶらないようにする
    public int[][] getKey() {
        Random rand = new Random();

        //二次元配列key[a][b]を設定する
        //[a] = 何番目の鍵か
        //[b](b == 0):配置した鍵のX座標,(b == 1):Y座標
        int[][] key = new int[3][2];
        int keyCount = 0;
        int randKeyX = 0;
        int randKeyY = 0;

        while(keyCount < 3) {
            randKeyX = rand.nextInt(width);
            randKeyY = rand.nextInt(height);

            if (getMap(randKeyX, randKeyY) == MapData.TYPE_SPACE) {
                if(randKeyX != 1 && randKeyY != 1) {
                    key[keyCount][0] = randKeyX;
                    key[keyCount][1] = randKeyY;

                    if(keyCount == 1){
                      if(key[keyCount][0] == key[keyCount-1][0] || key[keyCount][1] == key[keyCount-1][1]){
                        continue;
                      }
                    }else if(keyCount == 2){
                      if(key[keyCount][0] == key[keyCount-1][0] || key[keyCount][1] == key[keyCount-1][1]
                         || key[keyCount][0] == key[keyCount-2][0] || key[keyCount][1] == key[keyCount-2][1]){
                        continue;
                      }
                    }

                    System.out.println("Key placed:" + key[keyCount][0] + "," + key[keyCount][1]);

                    keyCount += 1;
                }
            }
        }

        return key;
    }

    public int getMap(int x, int y) {
        if (x < 0 || width <= x || y < 0 || height <= y) {
            return -1;
        }
        return maps[y][x];
    }

    public void setMap(int x, int y, int type) {
        if (x < 1 || width <= x - 1 || y < 1 || height <= y - 1) {
            return;
        }
        maps[y][x] = type;
    }

    public ImageView getImageView(int x, int y) {
        return mapImageViews[y][x];
    }

    public void setImageViews() {
        for (int y = 0; y < height; y ++) {
            for (int x = 0; x < width; x++) {
                mapImageViews[y][x] = new ImageView(mapImages[maps[y][x]]);
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
