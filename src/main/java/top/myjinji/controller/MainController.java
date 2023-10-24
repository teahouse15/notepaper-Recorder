package top.myjinji.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private VBox recordList;

    @FXML
    private Button closeButton;

    @FXML
    private void handleAddButtonClick(ActionEvent event) {





        recordList.getChildren().add(new Label("123"));
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
