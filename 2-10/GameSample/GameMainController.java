import java.io.IOException;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class GameMainController {

	@FXML
	void onTitleAction(ActionEvent event) {
		try {
			System.out.println("move to title window!");
            StageDB.getGameMainStage().hide();
            StageDB.getGameMainSound().stop();
            StageDB.getTitleStage().show();
            StageDB.getTitleSound().play();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

    @FXML
    void onGameOverAction(ActionEvent event) {
        try {
            System.out.println("move to gameOver window!");
            StageDB.getGameMainStage().hide();
            StageDB.getGameMainSound().stop();
            StageDB.getGameOverStage().show();
            StageDB.getGameOverSound().play();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void onSoundAction1(ActionEvent event) {
        try {
            System.out.println("play to effect1!");
            StageDB.getEffect1Sound().play();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void onSoundAction2(ActionEvent event) {
        try {
            System.out.println("play to effect2!");
            StageDB.getEffect2Sound().play();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
