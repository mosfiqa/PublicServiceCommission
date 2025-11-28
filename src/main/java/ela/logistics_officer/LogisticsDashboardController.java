package ela.logistics_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class LogisticsDashboardController {

    @javafx.fxml.FXML
    private BorderPane dashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void centerAllocationButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CenterManagement.fxml"));
            dashboardBorderPane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}