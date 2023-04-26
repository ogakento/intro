import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ex8_1add extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage st) throws Exception {
        int toggle = 0;
        Label l1 = new Label("Hello world!");
        Label l2 = new Label("こんにちは、世界！");
        BorderPane bp = new BorderPane();
        bp.setTop(l1);
        bp.setBottom(l2);
        Scene s = new Scene(bp, 320, 240);
        st.setScene(s);
        st.show();
    }
}


