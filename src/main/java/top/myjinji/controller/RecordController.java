package top.myjinji.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class RecordController {

    @FXML
    private ListView<String> listView;


    public void initialize() {
        // 设置ListView的数据模型并添加数据项
        ObservableList<String> data = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
        listView.setItems(data);
    }
}
