package top.myjinji;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CustomUIComponent {
    private VBox root;

    public CustomUIComponent() {
        // 创建UI组件
        Label label = new Label("Hello, JavaFX!");
        Button button = new Button("Click Me!");

        // 创建布局容器
        root = new VBox();
        root.getChildren().addAll(label, button);

        // 设置UI组件的事件处理逻辑
        button.setOnAction(event -> {
            label.setText("Button Clicked!");
        });
    }

    public VBox getRoot() {
        return root;
    }
}