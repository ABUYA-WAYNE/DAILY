
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class rand extends Application {

    @Override
    public void start(Stage window) {
        Button buttonMorning = new Button("good morning");
        Button buttonNight = new Button("good night");
        Label messageLabel = new Label();

        buttonMorning.setOnAction(e -> toggleLabel(messageLabel, "Have a great morning!"));
        buttonNight.setOnAction(e -> toggleLabel(messageLabel, "Have a lovely night!"));

        // VBox = vertical layout with 10px spacing
        VBox layout = new VBox(10);
        layout.getChildren().addAll(buttonMorning, buttonNight, messageLabel);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.setTitle("firstApp");
        window.show();
    }

    private void toggleLabel(Label label, String message) {
        if (label.getText().equals(message)) {
            label.setText("");
        } else {
            label.setText(message);
        }
    }

    public static void main(String[] args) {
        launch(rand.class);
        // rand.java
        System.out.println("Triggered streak update");
        System.out.println("Streak confirmed at " + java.time.LocalDate.now());

    }
}
