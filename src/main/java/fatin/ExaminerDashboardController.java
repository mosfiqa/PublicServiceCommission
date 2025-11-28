package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class ExaminerDashboardController
{
    @javafx.fxml.FXML
    private Label WelcomeLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageQuestionsButtonOnAction(ActionEvent actionEvent) {
        loadScene("/com/example/msv3_2310898/examiner_question_management.fxml", e);
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
        loadScene("/com/example/msv3_2310898/examiner_login.fxml", e);

    }

    @javafx.fxml.FXML
    public void viewSubmissionsButtonOnAction(ActionEvent actionEvent) {
        loadScene("/com/example/msv3_2310898/examiner_submission_view.fxml", e);
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