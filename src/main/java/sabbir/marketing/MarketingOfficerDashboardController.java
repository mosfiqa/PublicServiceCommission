package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class MarketingOfficerDashboardController
{
    @FXML
    private BorderPane dashboardBorderpane;


    @FXML
    public void initialize() {
    }

    @FXML
    public void createcampaingbutton(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("createcampaignview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void analyticsbutton(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("analyticsview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void eventbutton(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eventview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void publishcircularbutton(ActionEvent actionEvent){
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("publishcircularview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }


    @FXML
    public void budgetbutton(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("budgetview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }

    @FXML
    public void socialmediabutton(ActionEvent actionEvent) {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("socialmediaview.fxml"));
            dashboardBorderpane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
            //
        }
    }
}