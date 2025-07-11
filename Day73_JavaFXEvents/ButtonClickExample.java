import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonClickExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button btn = new Button("Click Me!");

        // Set the action handler for the button
        btn.setOnAction(e -> {
            System.out.println("Button was clicked!");
        });

        // Layout
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Scene
        Scene scene = new Scene(root, 300, 200);

        // Stage (window)
        primaryStage.setTitle("JavaFX Button Click Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
