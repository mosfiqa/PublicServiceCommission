package ela.accounts_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class AccountsDashboardController {

    @javafx.fxml.FXML
    private BorderPane dashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyPaymentButtonOnAction(ActionEvent actionEvent) {
        try {
            // Teacher Style: Load the "PaymentVerification" FXML
            // and set it into the CENTER of the Dashboard BorderPane
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PaymentVerification.fxml"));
            dashboardBorderPane.setCenter(fxmlLoader.load());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}