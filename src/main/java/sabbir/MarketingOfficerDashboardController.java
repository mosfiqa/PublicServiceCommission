package sabbir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MarketingOfficerDashboardController
{
    private void openNewStage(String fxmlFile, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sabbir/" + fxmlFile));
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
    public void initialize() {
    }

    @FXML
    public void createcampaingbutton(ActionEvent actionEvent) {
        openNewStage("createcampaignview.fxml", "Create Campaing");
    }

    @FXML
    public void analyticsbutton(ActionEvent actionEvent) {
        openNewStage("analyticsview.fxml", "Campaign Analytics & Reporting");
    }

    @FXML
    public void quickcreaterecruitmentcampaignbutton(ActionEvent actionEvent) {
        createcampaingbutton(actionEvent);
    }

    @FXML
    public void quickpublishnewcircularbutton(ActionEvent actionEvent) {
        publishcircularbutton(actionEvent);
    }

    @FXML
    public void eventbutton(ActionEvent actionEvent) {
        openNewStage("eventview.fxml", "Event Planning & Management");
    }

    @FXML
    public void publishcircularbutton(ActionEvent actionEvent){
        openNewStage("publishcircularview.fxml", "Publish Circular");
    }

    @FXML
    public void quickplaneventbutton(ActionEvent actionEvent) {
        eventbutton(actionEvent);
    }

    @FXML
    public void candidateexperiancebutton(ActionEvent actionEvent) {
        openNewStage("candidateexperienceview.fxml", "Candidate Experience Review");
    }

    @FXML
    public void budgetbutton(ActionEvent actionEvent) {
        openNewStage("eventview.fxml", "Budget Tracking & Management");
    }

    @FXML
    public void quickanalyticsreportbutton(ActionEvent actionEvent) {
        analyticsbutton(actionEvent);
    }

    @FXML
    public void contentbutton(ActionEvent actionEvent) {
        openNewStage("contentview.fxml", "Content Management System");
    }

    @FXML
    public void socialmediabutton(ActionEvent actionEvent) {
        openNewStage("socialmediaview.fxml", "Social Media");
    }
}