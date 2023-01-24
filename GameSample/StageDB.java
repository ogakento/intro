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

    static private Stage titleStage = null;
    static private Stage gameMainStage = null;
    static private Stage gameOverStage = null;
    static private Media titleSound = null;
    static private Media gameMainSound = null;
    static private Media gameOverSound = null;
    static private Media effect1Sound = null;
    static private Media effect2Sound = null;
    static private MediaPlayer titleMp = null;
    static private MediaPlayer mainMp = null;
    static private MediaPlayer gameOverMp = null;
    static private MediaPlayer effect1Mp = null;
    static private MediaPlayer effect2Mp = null;
    static private final String mainSoundFileName = "sound/title.mp3";
    static private final String gameMainSoundFileName = "sound/gamemain.mp3";
    static private final String gameOverSoundFileName = "sound/gameover.mp3";
    static private final String effectSound1FileName = "sound/fire.mp3";
    static private final String effectSound2FileName = "sound/magical.mp3";
    static private Class mainClass;

    static public void setMainClass(Class mainClass) {
        StageDB.mainClass = mainClass;
    }

    static public MediaPlayer getTitleSound() {
        if (titleSound == null) {
            try {
                titleSound = new Media(new File(mainSoundFileName).toURI().toString());
                titleMp = new MediaPlayer(titleSound);
                titleMp.setCycleCount(MediaPlayer.INDEFINITE); // loop play
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return titleMp;
    }

    static public MediaPlayer getGameMainSound() {
        if (gameMainSound == null) {
            try {
                gameMainSound = new Media(new File(gameMainSoundFileName).toURI().toString());
                mainMp = new MediaPlayer(gameMainSound);
                mainMp.setCycleCount(MediaPlayer.INDEFINITE); // loop play
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return mainMp;
    }

    static public MediaPlayer getGameOverSound() {
        if (gameOverSound == null) {
            try {
                gameOverSound = new Media(new File(gameOverSoundFileName).toURI().toString());
                gameOverMp = new MediaPlayer(gameOverSound);
                gameOverMp.setCycleCount(MediaPlayer.INDEFINITE); // loop play
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return gameOverMp;
    }

    static public MediaPlayer getEffect1Sound() {
        if (effect1Sound == null) {
            try {
                effect1Sound = new Media(new File(effectSound1FileName).toURI().toString());
                effect1Mp = new MediaPlayer(effect1Sound);
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return effect1Mp;
    }

    static public MediaPlayer getEffect2Sound() {
        if (effect2Sound == null) {
            try {
                effect2Sound = new Media(new File(effectSound2FileName).toURI().toString());
                effect2Mp = new MediaPlayer(effect2Sound);
            } catch (Exception io) {
                System.err.print(io.getMessage());
            }
        }
        return effect2Mp;
    }

    static public Stage getTitleStage() {
        if (titleStage == null) {
            try {
                FXMLLoader loader = new FXMLLoader(mainClass.getResource("fxml/title.fxml"));
                VBox root = loader.load();
                Scene scene = new Scene(root);
                titleStage = new Stage();
                titleStage.setScene(scene);
            } catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
        return titleStage;
    }

    static public Stage getGameMainStage() {

        if (gameMainStage == null) {
            try {
                FXMLLoader loader = new FXMLLoader(mainClass.getResource("fxml/gameMain.fxml"));
                VBox root = loader.load();
                Scene scene = new Scene(root);
                gameMainStage = new Stage();
                gameMainStage.setScene(scene);
            } catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
        return gameMainStage;
    }

    static public Stage getGameOverStage() {
        if (gameOverStage == null) {
            try {
                FXMLLoader loader = new FXMLLoader(mainClass.getResource("fxml/gameOver.fxml"));
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
}
