package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ExaminerSubmissionController
{
<<<<<<< HEAD
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn questionsTableColumn;
    @javafx.fxml.FXML
    private TextArea submissionDetailsTextArea;
    @javafx.fxml.FXML
    private TableView submissionsTableView;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn studentTableColumn;

    @javafx.fxml.FXML
=======
    @FXML
    private TableColumn statusTableColumn;
    @FXML
    private TableColumn questionsTableColumn;
    @FXML
    private TextArea submissionDetailsTextArea;
    @FXML
    private TableView submissionsTableView;
    @FXML
    private TableColumn dateTableColumn;
    @FXML
    private TableColumn studentTableColumn;

    @FXML
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
    public void initialize() {
        loadSubmissions();
    }

    private void loadSubmissions() {
        list.clear();
        try {
            Connection con = DBConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM submissions");

            while (rs.next()) {
                list.add(new Submission(
                        rs.getInt("id"),
                        rs.getString("student_name"),
                        rs.getString("question_title"),
                        rs.getString("date"),
                        rs.getString("status"),
                        rs.getString("answer")
                ));
            }

            tblSubmissions.setItems(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void ViewDetails() {
        Submission s = tblSubmissions.getSelectionModel().getSelectedItem();
        if (s != null) {
            txtSubmissionDetails.setText(s.getAnswer());
        }

    }

<<<<<<< HEAD
    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }
}
=======
    @FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }
}
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
