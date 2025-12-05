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
        loadScene("/com/example/msv3_2310898/admin_login.fxml", event);
    }

    @FXML
    public void ViewLogsButtonOnAction(ActionEvent actionEvent) {
        loadScene("/com/example/msv3_2310898/admin_log_monitor.fxml", event);
    }

    @FXML
    public void ManageUsersButtonOnAction(ActionEvent actionEvent) {
        loadScene("/com/example/msv3_2310898/admin_user_management.fxml", event);
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