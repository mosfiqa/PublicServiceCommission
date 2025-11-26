module com.example.publicservicecommission {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens com.example.publicservicecommission to javafx.fxml;
    exports com.example.publicservicecommission;
}