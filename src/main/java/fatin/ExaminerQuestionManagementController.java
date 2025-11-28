package com.example.msv3_2310898;

import com.sun.jdi.connect.spi.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExaminerQuestionManagementController
{
    @FXML
    private ComboBox<String> cmbQuestionType;
    @FXML
    private TableColumn titleTableColumn;
    @FXML
    private TableView<Question> tblQuestions;
    @FXML
    private TableColumn idTableColumn;
    @FXML
    private TableColumn typeTableColumn;
    @FXML
    private TextField txtQuestionTitle;
    @FXML
    private TextArea txtQuestionBody;
    ObservableList<Question> list = FXCollections.observableArrayList();

        @FXML
        public void initialize() {
            cmbQuestionType.getItems().addAll("MCQ", "Written", "True/False");
            loadQuestions();
        }

        private void loadQuestions() {
            list.clear();
            try {
                Connection con = DBConnection.getConnection();
                ResultSet rs = con.createStatement().executeQuery("SELECT * FROM questions");

                while (rs.next()) {
                    list.add(new Question(
                            rs.getInt("id"),
                            rs.getString("title"),
                            rs.getString("body"),
                            rs.getString("type")
                    ));
                }

                tblQuestions.setItems(list);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @FXML
        public void AddQuestion() {
            if (txtQuestionTitle.getText().isEmpty() ||
                    txtQuestionBody.getText().isEmpty() ||
                    cmbQuestionType.getValue() == null) {

                showAlert("Fill all fields!");
                return;
            }

            try {
                Connection con = DBConnection.getConnection();
                String sql = "INSERT INTO questions(title,body,type) VALUES(?,?,?)";

                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, txtQuestionTitle.getText());
                pst.setString(2, txtQuestionBody.getText());
                pst.setString(3, cmbQuestionType.getValue());
                pst.executeUpdate();

                showAlert("Question Added!");
                loadQuestions();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void showAlert(String msg) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText(msg);
            a.show();
        }
    }

    @FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteButtonOnAction(ActionEvent actionEvent) {
    }
}