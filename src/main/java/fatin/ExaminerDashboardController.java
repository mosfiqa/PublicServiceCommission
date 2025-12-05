package fatin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
=======
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143

public class ExaminerDashboardController
{
    @javafx.fxml.FXML
    private Label WelcomeLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manageQuestionsButtonOnAction(ActionEvent actionEvent) {
<<<<<<< HEAD
        loadScene("examiner_question_management.fxml", e);
=======
        loadScene("/com/example/msv3_2310898/examiner_question_management.fxml", e);
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
<<<<<<< HEAD
        loadScene("examiner_login.fxml", e);
=======
        loadScene("/com/example/msv3_2310898/examiner_login.fxml", e);
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143

    }

    @javafx.fxml.FXML
    public void viewSubmissionsButtonOnAction(ActionEvent actionEvent) {
<<<<<<< HEAD
        loadScene("examiner_submission_view.fxml", e);
=======
        loadScene("/com/example/msv3_2310898/examiner_submission_view.fxml", e);
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
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
<<<<<<< HEAD
}
=======
}
>>>>>>> edf9a20480fa0e4280e9fae33fce03d9bef57143
