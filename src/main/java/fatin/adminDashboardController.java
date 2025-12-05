package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AdminDashboardController
{
    @FXML
    public void initialize() {
    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
        loadScene("admin_login.fxml",);
    }

    @FXML
    public void ViewLogsButtonOnAction(ActionEvent actionEvent) {
        loadScene("admin_log_monitor.fxml",loadScene(admin_log_monitor.fxml););
    }

    @FXML
    public void ManageUsersButtonOnAction(ActionEvent actionEvent) {
        loadScene("admin_user_management.fxml", event);
    }

    @FXML
    public void SystemConfigurationButtonOnAction(ActionEvent actionEvent) {
        System.out.println("Not implemented yet!");
    }
    private void loadScene(String fxml, ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();


        }