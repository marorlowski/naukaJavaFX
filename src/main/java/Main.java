import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        Button button = new Button("Przycisk");
        //stackPane to jakby tło dekoracja sceny
        stackPane.getChildren().add(button);

        //to scena - może się zmieniać
        Scene scene = new Scene(stackPane, 400, 600);

        //stage to deski teatru stage/scene/stackPane i dopiero nasze przyciski itp.
        primaryStage.setScene(scene);

        //wymiary ważniejsze
        primaryStage.setWidth(200);
        primaryStage.setHeight(400);

        //blokada zmiany rozmiaru
        primaryStage.setResizable(false);

        //primaryStage.setFullScreen(true);

        //miejsce uruchomienia na ekranie
        primaryStage.setX(900);
        primaryStage.setY(300);

        //Style sceny
        primaryStage.initStyle(StageStyle.DECORATED);

        primaryStage.setTitle("JavaFX");
        primaryStage.show();
    }
}
