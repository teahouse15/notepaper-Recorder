module top.myjinji.recorder {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.myjinji to javafx.fxml;
    exports top.myjinji.controller;
    opens top.myjinji.controller to javafx.fxml;
    exports top.myjinji;
}