import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TestFX extends Application {

    @Override
    public void start(Stage stage) {
        Button btn = new Button("Ça marche !");
        Scene scene = new Scene(btn, 300, 200);

        stage.setTitle("Test JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}}