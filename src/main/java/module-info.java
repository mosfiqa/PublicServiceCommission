module com.example.publicservicecommission {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.desktop;


    opens com.example.publicservicecommission to javafx.fxml;
    exports com.example.publicservicecommission;
    exports sabbir to javafx.fxml, javafx.graphics;
    opens sabbir to javafx.fxml, javafx.graphics;
}