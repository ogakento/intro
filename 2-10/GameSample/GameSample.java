import javafx.application.Application;
import javafx.stage.Stage;

public class GameSample extends Application {
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.hide();
        StageDB.setMainClass(getClass());
        StageDB.getTitleStage().show();
        StageDB.getTitleSound().play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
