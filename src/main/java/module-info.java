module mainElements {
    requires javafx.controls;
    requires javafx.fxml;


    exports mainElements;
    opens mainElements to javafx.fxml;
}