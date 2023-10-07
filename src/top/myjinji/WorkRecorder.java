package top.myjinji;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("./fxml/WorkRecorder.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);

            // 引用CSS文件
            scene.getStylesheets().add(getClass().getResource("./css/main.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.setTitle("Your Title");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
