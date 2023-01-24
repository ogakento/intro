import java.io.IOException;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class GameOverController {

	@FXML
	void onTitleAction(ActionEvent event) {
		try {
			System.out.println("move to title window!");
            StageDB.getGameOverStage().hide();
            StageDB.getGameOverSound().stop();
            StageDB.getTitleStage().show();
            StageDB.getTitleSound().play();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
