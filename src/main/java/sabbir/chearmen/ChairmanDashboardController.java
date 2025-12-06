package sabbir.chearmen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class ChairmanDashboardController
{

    @FXML
    private BorderPane dashboardBorderpane;

    @FXML
    public void initialize() {

    }

    @FXML
    public void handleFinalApproval(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("finalmarksapprovalview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handleCandidateList(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("candidatelistpublication.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handlePolicyReview(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("policyreviewapproval.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handleAuditReports(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("auditreportview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handleAnnualReportSignoff(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("annualreportsignoff.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handleScheduleChange(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("schedulechangeview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handleDisputeResolution(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("disputeresolutionview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void handleUserAccess(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("useraccesscontrol.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }


}