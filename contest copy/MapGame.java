import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MapGame extends Application {
  Stage stage;

  @Override
  public void start(Stage primaryStage) throws Exception {
    stage = primaryStage;
    stage.hide();
    StageDB.setMainClass(getClass());
    StageDB.getMainStage().show();
    StageDB.getMainSound().play();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
