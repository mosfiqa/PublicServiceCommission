package fatin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

<<<<<<< HEAD
public class AdminUserManagementController {



    public class AdminUserManagementController implements Initializable {
        @FXML
        private TextField txtName, txtUsername;
        @FXML
        private TableColumn<User, Integer> colUserId;
        @FXML
        private PasswordField txtPassword;
        @javafx.fxml.FXML
        private TextField nameTextField;
        @FXML
        private ComboBox<String> cmbRole;
        @FXML
        private TableView<User> tblUsers;
        @FXML
        private TableColumn<User, String> colUserName, colRole;
        @javafx.fxml.FXML
        private TextField usernameTextField;
        ObservableList<User> list = FXCollections.observableArrayList();
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            cmbRole.getItems().addAll("Admin", "Examiner");

            colUserId.setCellValueFactory(f -> f.getValue().userIdProperty().asObject());
            colUserName.setCellValueFactory(f -> f.getValue().usernameProperty());
            colRole.setCellValueFactory(f -> f.getValue().roleProperty());

            loadUsers();
        }

        private void loadUsers() {
            list.clear();
            try {
                Connection con = DBConnection.getConnection();
                String sql = "SELECT * FROM users";
                ResultSet rs = con.createStatement().executeQuery(sql);

                while (rs.next()) {
                    list.add(new User(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("role")
                    ));
                }

                tblUsers.setItems(list);

            } catch (Exception e) {
                e.printStackTrace();
            }

            @FXML
            public void adduserButtonOnAction (ActionEvent actionEvent){
                if (txtName.getText().isEmpty() ||
                        txtUsername.getText().isEmpty() ||
                        txtPassword.getText().isEmpty() ||
                        cmbRole.getValue() == null) {

                    showAlert("Please fill all fields!");
                    return;
                }

                try {
                    Connection con = DBConnection.getConnection();
                    String sql = "INSERT INTO users(name,username,password,role) VALUES(?,?,?,?)";

                    PreparedStatement pst = con.prepareStatement(sql);

                    pst.setString(1, txtName.getText());
                    pst.setString(2, txtUsername.getText());
                    pst.setString(3, txtPassword.getText());
                    pst.setString(4, cmbRole.getValue());

                    pst.executeUpdate();
                    showAlert("User added!");
                    loadUsers();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        @javafx.fxml.FXML
        public void deleteButtonOnAction(ActionEvent actionEvent) {
            User u = tblUsers.getSelectionModel().getSelectedItem();
            if (u == null) {
                showAlert("Select a user to delete!");
=======

public class AdminUserManagementController implements Initializable {
    @FXML
    private TextField txtName, txtUsername;
    @FXML
    private TableColumn<User, Integer> colUserId;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> cmbRole;
    @FXML
    private TableView<User> tblUsers;
    @FXML
    private TableColumn<User, String> colUserName, colRole;
    @FXML
    private TextField usernameTextField;
    ObservableList<User> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbRole.getItems().addAll("Admin", "Examiner");

        colUserId.setCellValueFactory(f -> f.getValue().userIdProperty().asObject());
        colUserName.setCellValueFactory(f -> f.getValue().usernameProperty());
        colRole.setCellValueFactory(f -> f.getValue().roleProperty());

        loadUsers();
    }

    private void loadUsers() {
        list.clear();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM users";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                list.add(new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                ));
            }

            tblUsers.setItems(list);

        } catch (Exception e) {
            e.printStackTrace();
        }

        @FXML
        public void adduserButtonOnAction (ActionEvent actionEvent){
            if (txtName.getText().isEmpty() ||
                    txtUsername.getText().isEmpty() ||
                    txtPassword.getText().isEmpty() ||
                    cmbRole.getValue() == null) {

                showAlert("Please fill all fields!");
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
                return;
            }

            try {
                Connection con = DBConnection.getConnection();
<<<<<<< HEAD
                String sql = "DELETE FROM users WHERE id=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, u.getUserId());
                pst.executeUpdate();

                showAlert("User deleted!");
                loadUsers();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        private void showAlert(String msg) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText(null);
            a.setContentText(msg);
            a.show();



        }

        @javafx.fxml.FXML
        public void updateUserButtonOnAction(ActionEvent actionEvent) {
            User u = tblUsers.getSelectionModel().getSelectedItem();
            if (u == null) {
                showAlert("Select a user first!");
                return;
            }

            try {
                Connection con = DBConnection.getConnection();
                String sql = "UPDATE users SET name=?,username=?,password=?,role=? WHERE id=?";

                PreparedStatement pst = con.prepareStatement(sql);
=======
                String sql = "INSERT INTO users(name,username,password,role) VALUES(?,?,?,?)";

                PreparedStatement pst = con.prepareStatement(sql);

>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
                pst.setString(1, txtName.getText());
                pst.setString(2, txtUsername.getText());
                pst.setString(3, txtPassword.getText());
                pst.setString(4, cmbRole.getValue());
<<<<<<< HEAD
                pst.setInt(5, u.getUserId());

                pst.executeUpdate();
                showAlert("User updated!");
=======

                pst.executeUpdate();
                showAlert("User added!");
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
                loadUsers();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
<<<<<<< HEAD


        }
}
=======
        }
    }

    @FXML
    public void deleteButtonOnAction(ActionEvent actionEvent) {
        User u = tblUsers.getSelectionModel().getSelectedItem();
        if (u == null) {
            showAlert("Select a user to delete!");
            return;
        }

        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, u.getUserId());
            pst.executeUpdate();

            showAlert("User deleted!");
            loadUsers();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showAlert(String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText(null);
        a.setContentText(msg);
        a.show();



    }

    @FXML
    public void updateUserButtonOnAction(ActionEvent actionEvent) {
        User u = tblUsers.getSelectionModel().getSelectedItem();
        if (u == null) {
            showAlert("Select a user first!");
            return;
        }

        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE users SET name=?,username=?,password=?,role=? WHERE id=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, txtName.getText());
            pst.setString(2, txtUsername.getText());
            pst.setString(3, txtPassword.getText());
            pst.setString(4, cmbRole.getValue());
            pst.setInt(5, u.getUserId());

            pst.executeUpdate();
            showAlert("User updated!");
            loadUsers();

        } catch (Exception ex) {
            ex.printStackTrace();
        }


}
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
