package top.myjinji;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TwoAreasApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Two Areas Example");

        // 创建顶部区域
        Label topLabel = new Label("Top Area");
        BorderPane.setAlignment(topLabel, javafx.geometry.Pos.CENTER);

        // 创建中间区域
        Label centerLabel = new Label("Center Area");
        BorderPane.setAlignment(centerLabel, javafx.geometry.Pos.CENTER);

        // 创建BorderPane容器并设置各个区域
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topLabel);
        borderPane.setCenter(centerLabel);

        // 创建Scene并设置BorderPane作为根节点
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}