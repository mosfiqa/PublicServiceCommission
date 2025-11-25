package sabbir;

import com.example.publicservicecommission.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class MarketingOfficerDashboardController
{
    @javafx.fxml.FXML
    private Label newapplicationlabel;
    @javafx.fxml.FXML
    private TableColumn duestatuscoloum;
    @javafx.fxml.FXML
    private LineChart analyzecampaingchart;
    @javafx.fxml.FXML
    private Label budgetremaingdatalabel;
    @javafx.fxml.FXML
    private TableView pendingtaskstableview;
    @javafx.fxml.FXML
    private Label livecerculardatalabel;
    @javafx.fxml.FXML
    private TableColumn taskdiscriptioncoloum;

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
            System.err.println("Error loading FXML file: " + fxmlFile);
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createcampaingbutton(ActionEvent actionEvent) {
        openNewStage("createcampaignview.fxml", "Create Campaing");
    }
    @javafx.fxml.FXML
    public void analyticsbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void quickcreaterecruitmentcampaignbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void quickpublishnewcircularbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eventbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void publishcircularbutton(ActionEvent actionEvent){
        openNewStage("publishcircularview.fxml", "Publish Circular");
    }

    @javafx.fxml.FXML
    public void quickplaneventbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void candidateexperiancebutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void budgetbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void quickanalyticsreportbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void contentbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void socialmediabutton(ActionEvent actionEvent) {
        openNewStage("socialmediaview.fxml", "Social Media");

    }
}