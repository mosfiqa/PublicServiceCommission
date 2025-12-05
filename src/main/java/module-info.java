module com.example.publicservicecommission {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
<<<<<<< HEAD
    requires java.sql;
=======
    requires java.xml;
    requires java.desktop;
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143


    opens com.example.publicservicecommission to javafx.fxml;
    exports com.example.publicservicecommission;
}