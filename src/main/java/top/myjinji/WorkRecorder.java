package top.myjinji;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class WorkRecorder extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(WorkRecorder.class.getResource("/fxml/main.fxml"));
            Parent root = loader.load();


            Scene scene = new Scene(root);

            scene.getStylesheets().add(WorkRecorder.class.getResource("/fxml/css/main.css").toExternalForm());

            // 窗口配置
            stage.setResizable(false);
            // 设置无边框
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.setTitle("Your Title");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
