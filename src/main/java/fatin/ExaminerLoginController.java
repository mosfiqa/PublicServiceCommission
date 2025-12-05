package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ExaminerLoginController
{
    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField txtUsername;
    @FXML
    private Label lblError;
<<<<<<< HEAD
    @javafx.fxml.FXML
=======
    @FXML
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
    public void initialize() {
        lblError.setText("");  // clear error label


<<<<<<< HEAD
    }
=======
}
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143

    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        if (txtUsername.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty()) {
            lblError.setText("Empty fields!");
            return;
        }

        try {
            // --------------- DATABASE CONNECTION ---------------
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM examiners WHERE username=? AND password=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, txtUsername.getText().trim());
            pst.setString(2, txtPassword.getText().trim());

            ResultSet rs = pst.executeQuery();

            // --------------- VERIFICATION ---------------
            if (rs.next()) {
                loadScene("/com/example/msv3_2310898/examiner_dashboard.fxml", event);
            } else {
                lblError.setText("Invalid login!");
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            lblError.setText("Database error!");
        }
    }

    private void loadScene(String fxml, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




<<<<<<< HEAD
}
=======
}
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
