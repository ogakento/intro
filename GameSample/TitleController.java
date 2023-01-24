import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TitleController {

	@FXML
	void onStartAction(ActionEvent event) {
		try {
			System.out.println("move to gameMail window!");
            StageDB.getTitleStage().hide();
            StageDB.getTitleSound().stop();
            StageDB.getGameMainStage().show();
            StageDB.getGameMainSound().play();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
