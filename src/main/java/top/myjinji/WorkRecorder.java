package top.myjinji;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
                System.out.println("点击窗口");
            });
            root.setOnMouseDragged(event -> {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
                System.out.println("窗口被移动");
                System.out.println(event.getSceneX());
                System.out.println(event.getSceneY());
            });


            // 窗口配置
            primaryStage.setResizable(false);
            // 设置无边框
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Your Title");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
