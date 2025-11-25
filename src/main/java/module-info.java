module com.example.publicservicecommission {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.publicservicecommission to javafx.fxml;
    exports com.example.publicservicecommission;
}