package top.myjinji.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.json.JSONObject;
import top.myjinji.CustomEventBus;
import top.myjinji.EventListener;
import top.myjinji.EventType;

public class RecordController {

    @FXML
    private VBox recordList;

    private CustomEventBus eventBus;

    public RecordController(CustomEventBus eventBus) {
        this.eventBus = eventBus;
        // 添加事件监听器
        eventBus.addListener(new EventListener() {
            @Override
            public void onEvent(EventType eventType, Object data) {
                if (eventType == EventType.ADD_LABEL) {
                    // 在这里添加Label元素到recordList，使用 data 获取标签文本
                    Label label = new Label((String) data);
                    recordList.getChildren().add(label);
                } else if (eventType == EventType.DELETE_LABEL) {
                    // 在这里执行删除Label元素的操作，使用 data 获取要删除的Label对象或其他数据
                    // ...
                }
            }
        });
    }
}
