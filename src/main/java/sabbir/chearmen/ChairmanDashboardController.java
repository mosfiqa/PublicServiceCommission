package sabbir.chearmen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ChairmanDashboardController
{
    @FXML private Label openDisputeLabel;
    @FXML private Label pendingPolicyLabel;
    @FXML private Label pendingResultLabel;

    @FXML
    public void initialize() {
        int pendingMarks = fetchPendingMarksCount();
        int pendingPolicies = fetchPendingPolicyCount();
        int openDisputes = fetchOpenDisputesCount();

        pendingResultLabel.setText(String.format("%02d", pendingMarks));
        pendingPolicyLabel.setText(String.format("%02d", pendingPolicies));
        openDisputeLabel.setText(String.format("%02d", openDisputes));
    }

    private int fetchPendingMarksCount() { return 7; }
    private int fetchPendingPolicyCount() { return 3; }
    private int fetchOpenDisputesCount() { return 2; }

    private void openNewStage(String fxmlFile, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sabbir/chearmen/" + fxmlFile));
            Stage newStage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());

            newStage.setTitle(title);
            newStage.setScene(scene);
            newStage.show();
        }
        catch (IOException e){

        }
    }

    @FXML
    public void handleFinalApproval(ActionEvent actionEvent) {

        openNewStage("finalmarksapprovalview.fxml", "Final Marks Approval (Goal 1)");
    }

    @FXML
    public void handleCandidateList(ActionEvent actionEvent) {
        openNewStage("candidatelistpublication.fxml", "Candidate List Publication (Goal 4)");
    }

    @FXML
    public void handlePolicyReview(ActionEvent actionEvent) {
        openNewStage("policyreviewapproval.fxml", "Policy Review & Approval (Goal 2)");
    }

    @FXML
    public void handleAuditReports(ActionEvent actionEvent) {
        openNewStage("auditreportview.fxml", "Audit Report Viewer (Goal 3)");
    }

    @FXML
    public void handleAnnualReportSignoff(ActionEvent actionEvent) {
        openNewStage("annualreportsignoff.fxml", "Annual Report Sign-off (Goal 7)");
    }

    @FXML
    public void handleScheduleChange(ActionEvent actionEvent) {

        openNewStage("schedulechangeview.fxml", "Schedule Change Approval (Goal 6)");
    }

    @FXML
    public void handleDisputeResolution(ActionEvent actionEvent) {

        openNewStage("disputeresolutionview.fxml", "Dispute Resolution (Goal 5)");
    }

    @FXML
    public void handleUserAccess(ActionEvent actionEvent) {
        openNewStage("useraccesscontrol.fxml", "User Access Control (Goal 8)");
    }


}