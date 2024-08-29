package javafx_samples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author michaelstucki
 */
// Extends Application, hence entry point for JavaFX application
public class SimpleJavaFxApp extends Application {
    private Label messageLabel;

    @Override
    // Set up the primary stage and its scene
    // A stage is the app's main window
    // The JavaFX runtime provides primaryStage
    public void start(Stage primaryStage) {
        // Nodes
        messageLabel = new Label("Hello, JavaFX!");
        Button clickButton = new Button("Click Me!");
        // Add event handler
        clickButton.setOnAction(event -> handleButtonClick());
        // VBox layout arranges its children (node) vertically
        VBox vbox = new VBox(10, messageLabel, clickButton);
        // Inline CSS styling
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");
        // scene is container for all visual elements
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Simple JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick() {
        messageLabel.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        launch();
    }
}
