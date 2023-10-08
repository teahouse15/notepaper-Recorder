package top.myjinji;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class WorkRecorder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/main.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource("fxml/css/main.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.setTitle("Your Title");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
