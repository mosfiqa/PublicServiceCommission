module com.example.publicservicecommission {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.publicservicecommission to javafx.fxml;
    exports com.example.publicservicecommission;
}