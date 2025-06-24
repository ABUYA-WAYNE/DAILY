import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXIntro extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("   Wayne ");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("My First JavaFX Window");
        stage.setScene(scene);
        stage.show(); // ✅ This line is essential
    }

    public static void main(String[] args) {
        launch(args); // ✅ Required to start the JavaFX application thread
    }
}
