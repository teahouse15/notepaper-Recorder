package top.myjinji;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkRecorder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox vBox = FXMLLoader.load(getClass().getResource("./fxml/WorkRecorder.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
