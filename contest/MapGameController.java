

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;

import javafx.fxml.*;
import javafx.scene.*;

import java.io.IOException;
import java.io.File;

import javafx.animation.*;
import javafx.util.Duration;

public class MapGameController implements Initializable {
    public MapData mapData;
    public MoveChara chara;
    public GridPane mapGrid;
    public ImageView[] mapImageViews;
    public Label setTimerLabel;
    public static Timeline timer;
    public Timeline initTimer;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mapData = new MapData(21, 15);
        chara = new MoveChara(1, 1, mapData);
        mapImageViews = new ImageView[mapData.getHeight() * mapData.getWidth()];
        for (int y = 0; y < mapData.getHeight(); y ++) {
            for (int x = 0; x < mapData.getWidth(); x ++) {
                int index = y * mapData.getWidth() + x;
                mapImageViews[index] = mapData.getImageView(x, y);
            }
        }
        drawMap(chara, mapData);

        //タイマーの更新を100ミリ秒おきに読み取るためのiniTimerを作成、timelabelの値をsetTimerLabelに代入する
        initTimer = new Timeline(new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>(){

            @Override
            @FXML
            public void handle(ActionEvent event) {
                setTimerLabel.setText(timelabel.getText());
            }
        }));
        initTimer.setCycleCount(Timeline.INDEFINITE);
        initTimer.play();



    }

    // Draw the map
    public void drawMap(MoveChara c, MapData m) {
        int cx = c.getPosX();
        int cy = c.getPosY();

        mapGrid.getChildren().clear();
        for (int y = 0; y < mapData.getHeight(); y ++) {
            for (int x = 0; x < mapData.getWidth(); x ++) {
                int index = y * mapData.getWidth() + x;
                if (x == cx && y == cy) {
                    mapGrid.add(c.getCharaImageView(), x, y);
                } else {
                    //KEYを取ったあとと前で迷路画像が変わるため新たに呼び出している
                    mapImageViews[index] = mapData.getImageView(x, y);
                    mapGrid.add(mapImageViews[index], x, y);
                }
            }
        }
    }

    // Get users' key actions
    //キー配列をAWSDに変更した
    public void keyAction(KeyEvent event) {
        KeyCode key = event.getCode();
        System.out.println("keycode:" + key);
        if (key == KeyCode.A) {
            leftButtonAction();
        } else if (key == KeyCode.S) {
            downButtonAction();
        } else if (key == KeyCode.W) {
            upButtonAction();
        } else if (key == KeyCode.D) {
            rightButtonAction();
        }
    }

    // Operations for going the cat up
    public void upButtonAction() {
        printAction("UP");
        chara.setCharaDirection(MoveChara.TYPE_UP);
        chara.move(0, -1);
        drawMap(chara, mapData);
    }

    // Operations for going the cat down
    public void downButtonAction() {
        printAction("DOWN");
        chara.setCharaDirection(MoveChara.TYPE_DOWN);
        chara.move(0, 1);
        drawMap(chara, mapData);
    }

    // Operations for going the cat right
    public void leftButtonAction() {
        printAction("LEFT");
        chara.setCharaDirection(MoveChara.TYPE_LEFT);
        chara.move(-1, 0);
        drawMap(chara, mapData);
    }

    // Operations for going the cat right
    public void rightButtonAction() {
        printAction("RIGHT");
        chara.setCharaDirection(MoveChara.TYPE_RIGHT);
        chara.move(1, 0);
        drawMap(chara, mapData);
    }

    @FXML
    public void func1ButtonAction(ActionEvent event) {
        try {
            System.out.println("func1");
            StageDB.getMainStage().hide();
            StageDB.getMainSound().stop();
            StageDB.getGameOverStage().show();
            StageDB.getGameOverSound().play();
            timerStop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    public void func2ButtonAction(ActionEvent event) {
        // func2ボタンをクリックするとinitializeメソッドと同じような動きをし、迷路を作り変える
        try{
            System.out.println("func2");
            StageDB.getMainStage().hide();
            StageDB.getMainSound().stop();
            mapData = new MapData(21, 15);
            chara = new MoveChara(1, 1, mapData);
            mapImageViews = new ImageView[mapData.getHeight() * mapData.getWidth()];
            for (int y = 0; y < mapData.getHeight(); y ++) {
                for (int x = 0; x < mapData.getWidth(); x ++) {
                    int index = y * mapData.getWidth() + x;
                    mapImageViews[index] = mapData.getImageView(x, y);
                }
            }
            drawMap(chara, mapData);

            timerReset();

            StageDB.getMainStage().show();
            StageDB.getMainSound().play();
        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }

    @FXML
    public void func3ButtonAction(ActionEvent event) {
        System.out.println("func3: Nothing to do");
    }

    @FXML
    public void func4ButtonAction(ActionEvent event) {
        System.out.println("func4: Nothing to do");
    }

    // Print actions of user inputs
    public void printAction(String actionString) {
        System.out.println("Action: " + actionString);
    }


    @FXML static final Label timelabel = new Label("0");
    public static boolean stop = false;


    //新しくタイマーを作成しplayさせる、1000ミリ秒おきにtimelabelの値を+1する
    //stop == true の場合はタイマーを止める
    public static void timerStart() {

        stop = false;
        timerReset();
        System.out.println("Timer started!");

        timer = new Timeline(new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>(){

            @Override
            @FXML
            public void handle(ActionEvent event) {
                if (stop == true) {
                    timer.stop();
                } else if(stop == false) {
                    timelabel.setText(String.valueOf(Integer.parseInt(timelabel.getText()) + 1));
                    System.out.println("time:" + timelabel.getText());
                }

            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();
    }

    //タイマーをリセットする、ゲームオーバーやゲームクリアなどでタイマーが止まっていた場合には新しいタイマーを作成する
    public static void timerReset() {
        if(stop == true) {
            timerStart();
        } else {
            timelabel.setText("0");
            stop = false;
        }
    }

    //ゲームオーバーやゲームクリア時にタイマーを止めるため、stop = trueにする
    //すでにstop == trueである場合は何もしない
    public static void timerStop() {
        if(stop == false) {
            stop = true;
            System.out.println("Timer stopped!");
        }
    }

}
