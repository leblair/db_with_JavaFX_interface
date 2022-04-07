module com.example.db_with_javafx_interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.db_with_javafx_interface to javafx.fxml;
    exports com.example.db_with_javafx_interface;
}