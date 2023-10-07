package top.myjinji;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class UsernameInputField {
    private VBox root;

    public UsernameInputField() {
        // 创建UI组件
        Label usernameLabel = new Label("用户名:");
        TextField usernameField = new TextField();

        // 创建布局容器
        root = new VBox();
        root.getChildren().addAll(usernameLabel, usernameField);
    }

    public VBox getRoot() {
        return root;
    }
}