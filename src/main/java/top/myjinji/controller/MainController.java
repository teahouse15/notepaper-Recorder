package top.myjinji.controller;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainController {

    @FXML
    private VBox recordList;

    @FXML
    private Button closeButton;

    @FXML
    private void handleAddButtonClick(ActionEvent event) {
        TextField textField = new TextField();
        textField.setPrefHeight(30);
        textField.setPrefWidth(200);
        textField.getStyleClass().add("record-item");

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(300), textField);
        translateTransition.setFromX(-200); // 初始高度为0
        translateTransition.setToX(0); // 最大高度为1
        textField.requestFocus();
        textField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                translateTransition.play(); // 获得焦点时播放动画
            } else {
                translateTransition.setRate(-1); // 反向播放动画
                translateTransition.play();
            }
        });


        textField.setOnAction(textFieldEvent -> {
            String text = textField.getText();
            // 在这里处理回车键被按下后的操作，可以处理输入的文本（text）或执行其他逻辑
            System.out.println("Enter pressed, text is: " + text);
        });
        HBox body = new HBox(textField);
        recordList.getChildren().add(body);
    }

    @FXML
    private void handleMinButtonClick(ActionEvent event) {

    }


    @FXML
    private void handleCloseButtonClick(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

}
