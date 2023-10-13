package top.myjinji.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import top.myjinji.CustomEventBus;
import top.myjinji.EventType;

public class ButtonController {
    @FXML
    private Button addButton;

    @FXML
    private Button minButton;

    @FXML
    private Button closeButton;

    private CustomEventBus eventBus;

    public ButtonController(CustomEventBus eventBus) {
        this.eventBus = eventBus;
    }

    @FXML
    private void addLabel(ActionEvent event) {
        // 在按钮点击时发布AddLabel事件，传递标签文本
        eventBus.postEvent(EventType.ADD_LABEL, "New Label Text");
    }


    @FXML
    // 处理固定按钮点击事件的逻辑
    private void handleMinButtonClick(ActionEvent event) {
//        blockButton.click
        System.out.println("min被点击了");
    }

    @FXML
    // 处理固定按钮点击事件的逻辑
    private void handleCloseButtonClick(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
//        Platform.exit();
    }
}
