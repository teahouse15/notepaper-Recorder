package top.myjinji.title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 创建一个Label控件
        Label label = new Label("这是一个带标题的GUI界面");

        // 创建一个布局容器，并将Label添加到其中
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // 创建一个场景，并将布局容器添加到场景中
        Scene scene = new Scene(root, 300, 200);

        // 设置窗口标题
        primaryStage.setTitle("带标题的GUI界面");
        // 将场景设置为主舞台的场景
        primaryStage.setScene(scene);
        // 显示窗口
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}