package top.myjinji;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class LoginButton {
    private VBox root;

    public LoginButton() {
        // 创建UI组件
        Button loginButton = new Button("登录");

        Alert alert = new Alert(Alert.AlertType.ERROR);

        // 创建布局容器
        root = new VBox();
        root.getChildren().add(loginButton);

        // 设置UI组件的事件处理逻辑
        loginButton.setOnAction(event -> {
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("This is an information dialog!");
            alert.showAndWait();
        });
    }

    public VBox getRoot() {
        return root;
    }
}