import java.io.IOException;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class GameClearController {

	@FXML
	void onGameClearAction(ActionEvent event) {
		try {
			StageDB.getGameClearStage().hide();
			StageDB.getMainSound().stop();
			StageDB.getMainStage().show();
			StageDB.getMainSound().play();
			StageDB.getGameClearSound().stop();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
