module top.myjinji {
    requires javafx.controls;
    requires javafx.fxml;
    requires json;


    opens top.myjinji to javafx.fxml;
    exports top.myjinji;
    opens top.myjinji.controller to javafx.fxml;
    exports top.myjinji.controller;
}