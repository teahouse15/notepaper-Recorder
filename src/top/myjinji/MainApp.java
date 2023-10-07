package top.myjinji;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import top.myjinji.LoginButton;
import top.myjinji.PasswordInputField;
import top.myjinji.UsernameInputField;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("登录界面");

        // 创建自定义UI组件对象
        UsernameInputField usernameInput = new UsernameInputField();
        PasswordInputField passwordInput = new PasswordInputField();
        LoginButton loginButton = new LoginButton();

        // 创建布局容器
        VBox root = new VBox(usernameInput.getRoot(), passwordInput.getRoot(), loginButton.getRoot());

        // 创建Scene并设置根节点
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}