package top.myjinji;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import top.myjinji.controller.ButtonController;
import top.myjinji.controller.RecordController;

import java.io.IOException;

public class WorkRecorder extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage primaryStage) {
        try {
            // 从fxml文件中读取Parent(布局)
            FXMLLoader loader = new FXMLLoader(WorkRecorder.class.getResource("/fxml/main.fxml"));
            Parent root = loader.load();

            // 场景
            Scene scene = new Scene(root);
            scene.getStylesheets().add(WorkRecorder.class.getResource("/fxml/css/main.css").toExternalForm());


            // 设置窗口可以使用鼠标拖拽
            root.setOnMousePressed(event -> {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            });
            // 当使用鼠标拖拽时
            root.setOnMouseDragged(event -> {
                // 通过鼠标点击不松开的事件，获取窗口在屏幕中的偏移
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            });


            // 窗口配置
            primaryStage.setResizable(false);
            // 设置无边框
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
