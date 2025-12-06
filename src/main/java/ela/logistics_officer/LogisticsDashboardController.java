package ela.logistics_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;

public class LogisticsDashboardController {

    @FXML private BorderPane dashboardBorderPane;


    @FXML private Button centerAllocationButton;
    @FXML private Button printAdmitCardsButton;
    @FXML private Button distributionListsButton;
    @FXML private Button trackInventoryButton;
    @FXML private Button transportScheduleButton;
    @FXML private Button dailyReportsButton;
    @FXML private Button incidentReportsButton;
    @FXML private Button returnCollectionButton;

    @FXML
    public void initialize() {}


    @FXML
    public void centerAllocationButtonOnAction(ActionEvent event) {
        loadView("CenterManagement.fxml");
    }


    @FXML
    public void trackInventoryButtonOnAction(ActionEvent event) {
        loadView("InventoryTracking.fxml");
    }


    @FXML public void printAdmitCardsButtonOnAction(ActionEvent event) { showWorkInProgress(); }
    @FXML public void distributionListsButtonOnAction(ActionEvent event) { showWorkInProgress(); }
    @FXML public void transportScheduleButtonOnAction(ActionEvent event) { showWorkInProgress(); }
    @FXML public void dailyReportsButtonOnAction(ActionEvent event) { showWorkInProgress(); }
    @FXML public void incidentReportsButtonOnAction(ActionEvent event) { showWorkInProgress(); }
    @FXML public void returnCollectionButtonOnAction(ActionEvent event) { showWorkInProgress(); }

    private void showWorkInProgress() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setContentText("This feature is under development.");
        alert.show();
    }

    private void loadView(String fxmlFileName) {
        try {
            String path = "/ela/logistics_officer/" + fxmlFileName;
            URL fileUrl = getClass().getResource(path);

            if (fileUrl == null) {
                throw new java.io.FileNotFoundException("Not found: " + path);
            }

            FXMLLoader loader = new FXMLLoader(fileUrl);
            dashboardBorderPane.setCenter(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Could not load page: " + e.getMessage());
            alert.showAndWait();
        }
    }
}