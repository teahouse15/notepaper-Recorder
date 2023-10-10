package top.myjinji.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import org.json.JSONObject;

public class RecordController {

    @FXML
    private ListView<String> listView;


    public void initialize() {
        // 创建JSON对象
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "zq");
        jsonObject.put("age", "13");
        jsonObject.put("num", "188");

        // 将JSON对象转换为字符串
        String jsonString = jsonObject.toString();

        // 创建ObservableList并将JSON字符串作为一个item添加
        ObservableList<String> data = FXCollections.observableArrayList(jsonString);

        // 设置ListView的数据模型
        listView.setItems(data);
    }
}
