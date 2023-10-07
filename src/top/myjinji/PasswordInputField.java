package top.myjinji;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

public class PasswordInputField {
    private VBox root;

    public PasswordInputField() {
        // 创建UI组件
        Label passwordLabel = new Label("密码:");
        PasswordField passwordField = new PasswordField();

        // 创建布局容器
        root = new VBox();
        root.getChildren().addAll(passwordLabel, passwordField);
    }

    public VBox getRoot() {
        return root;
    }
}