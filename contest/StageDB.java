import java.io.IOException;
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

class StageDB {

    static private Stage mainStage = null;
    static private Stage gameOverStage = null;
    static private Stage gameClearStage = null;
    static private MediaPlayer mainSound = null;
    static private MediaPlayer gameOverSound = null;
    static private MediaPlayer gameClearSound = null;
    static private Class mainClass;
    static private final String mainSoundFileName = "sound/72_bpm75.mp3"; // BGM by OtoLogic
    // GameOverになった際の音源
    static private final String gameOverSoundFileName = "sound/030_BPM80.mp3";
    // GameClearになった際の音源 フリーBGM・音楽素材MusMus https://musmus.main.jp
    static private final String gameClearSoundFileName = "sound/MusMus-BGM-104.mp3";

    public static void setMainClass(Class mainClass) {
        StageDB.mainClass = mainClass;
    }

    public static MediaPlayer getMainSound() {
        if (mainSound == null) {
            try {
                Media m = new Media(new File(mainSoundFileName).toURI().toString());
                MediaPlayer mp = new MediaPlayer(m);
                mp.setCycleCount(MediaPlayer.INDEFINITE); // loop play
                mp.setRate(1.0); // 1.0 = normal speed
                mp.setVolume(0.5); // volume from 0.0 to 1.0
                mainSound = mp;
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return mainSound;
    }
    //GameOverになった際に音源を再生するメソッド
    public static MediaPlayer getGameOverSound() {
        if (gameOverSound == null) {
            try {
                // please write down the code for playing gameover sound
                Media m = new Media(new File(gameOverSoundFileName).toURI().toString());
                MediaPlayer mp = new MediaPlayer(m);
                mp.setCycleCount(MediaPlayer.INDEFINITE); // loop play
                mp.setRate(1.0); // 1.0 = normal speed
                mp.setVolume(0.5); // volume from 0.0 to 1.0
                gameOverSound = mp;
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return gameOverSound;
    }
    //GameClearになった際に音源を再生するメソッド
    public static MediaPlayer getGameClearSound() {
        if (gameClearSound == null) {
            try {
                // please write down the code for playing gameclear sound
                Media m = new Media(new File(gameClearSoundFileName).toURI().toString());
                MediaPlayer mp = new MediaPlayer(m);
                mp.setCycleCount(MediaPlayer.INDEFINITE); // loop play
                mp.setRate(1.0); // 1.0 = normal speed
                mp.setVolume(0.5); // volume from 0.0 to 1.0
                gameClearSound = mp;
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return gameClearSound;
    }

    public static Stage getMainStage() {
        if (mainStage == null) {
            try {
                FXMLLoader loader = new FXMLLoader(mainClass.getResource("MapGame.fxml"));
                VBox root = loader.load();
                Scene scene = new Scene(root);
                MapGameController.timerStart();
                mainStage = new Stage();
                mainStage.setScene(scene);
            } catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
        return mainStage;
    }

    public static Stage getGameOverStage() {
        if (gameOverStage == null) {
            try {
                System.out.println("StageDB:getGameOverStage()");
                FXMLLoader loader = new FXMLLoader(mainClass.getResource("MapGameOver.fxml"));
                VBox root = loader.load();
                Scene scene = new Scene(root);
                gameOverStage = new Stage();
                gameOverStage.setScene(scene);
            } catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
        return gameOverStage;
    }
    public static Stage getGameClearStage() {
        if (gameClearStage == null) {
            try {
                System.out.println("StageDB:getGameClearStage()");
                FXMLLoader loader = new FXMLLoader(mainClass.getResource("MapGameClear.fxml"));
                VBox root = loader.load();
                Scene scene = new Scene(root);

                MapGameController.timerStop();

                gameClearStage = new Stage();
                gameClearStage.setScene(scene);
            } catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
        return gameClearStage;
    }
}
