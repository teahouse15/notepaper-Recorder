package top.myjinji.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonController {
    @FXML
    private Button blockButton;

    @FXML
    private Button minButton;

    @FXML
    private Button closeButton;

    @FXML
    // 处理固定按钮点击事件的逻辑
    private void handleBlockButtonClick(ActionEvent event) {
//        blockButton.click
        System.out.println("block被点击了");
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
