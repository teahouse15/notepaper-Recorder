module top.myjinji.title {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens top.myjinji.title to javafx.fxml;
    exports top.myjinji.title;
}