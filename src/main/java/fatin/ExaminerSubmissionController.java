package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ExaminerSubmissionController
{
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

    @javafx.fxml.FXML
    public void refreshButtonOnAction(ActionEvent actionEvent) {
    }
}
