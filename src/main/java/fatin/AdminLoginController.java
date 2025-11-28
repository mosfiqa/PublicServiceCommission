package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginController
{
    @FXML
    private TextField adminuserTextField;
    @FXML
    private TextField adminpasswordTextField;
    @FXML
    private Label errorLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        String user = txtAdminUser.getText();
        String pass = txtAdminPass.getText();

        if (user.isEmpty() || pass.isEmpty()) {
            lblError.setText("Please fill all fields!");
            return;
        }

        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM admin WHERE username=? AND password=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                loadScene("/com/example/msv3_2310898/admin_dashboard.fxml", event);
            } else {
                lblError.setText("Invalid username or password!");
            }

        } catch (Exception e) {
            lblError.setText("Database error!");
            e.printStackTrace();
        }
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

    }
}