import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex8_6add extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // ラジオボタンの作成
        RadioButton maleButton = new RadioButton("Male");
        RadioButton femaleButton = new RadioButton("Female");
        RadioButton notSayButton = new RadioButton("Prefer not to say");

        // トグルグループの作成
        ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(maleButton, femaleButton, notSayButton);

        // VBoxにラジオボタンを追加
        VBox vbox = new VBox(maleButton, femaleButton, notSayButton);

        // シーンの作成
        Scene scene = new Scene(vbox, 200, 120);

        // シーンをステージにセットして表示
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
