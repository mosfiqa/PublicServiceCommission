package ela.accounts_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import java.net.URL;

public class AccountsDashboardController {

    @FXML private BorderPane dashboardBorderPane;

    @FXML private Button verifyPaymentButton;
    @FXML private Button generateReceiptsButton;
    @FXML private Button processRefundsButton;
    @FXML private Button financialSummariesButton;
    @FXML private Button budgetPlanningButton;
    @FXML private Button comparisonChartsButton;
    @FXML private Button auditReportsButton;
    @FXML private Button monitorAnomaliesButton;

    @FXML
    public void initialize() {}


    @FXML public void verifyPaymentButtonOnAction(ActionEvent event) { loadView("PaymentVerification.fxml"); }
    @FXML public void generateReceiptsButtonOnAction(ActionEvent event) { loadView("ReceiptGenerator.fxml"); }
    @FXML public void processRefundsButtonOnAction(ActionEvent event) { loadView("RefundManagement.fxml"); }
    @FXML public void financialSummariesButtonOnAction(ActionEvent event) { loadView("FinancialSummary.fxml"); }
    @FXML public void budgetPlanningButtonOnAction(ActionEvent event) { loadView("BudgetPlanning.fxml"); }
    @FXML public void comparisonChartsButtonOnAction(ActionEvent event) { loadView("ComparisonChart.fxml"); }
    @FXML public void auditReportsButtonOnAction(ActionEvent event) { loadView("AuditReport.fxml"); }
    @FXML public void monitorAnomaliesButtonOnAction(ActionEvent event) { loadView("AnomalyMonitoring.fxml"); }


    private void loadView(String fxmlFileName) {
        try {
            String path = "/ela/accounts_officer/" + fxmlFileName;
            URL fileUrl = getClass().getResource(path);

            if (fileUrl == null) {
                throw new java.io.FileNotFoundException("FXML file not found at: " + path);
            }

            FXMLLoader fxmlLoader = new FXMLLoader(fileUrl);
            dashboardBorderPane.setCenter(fxmlLoader.load());

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("CRITICAL LOADING ERROR");
            alert.setHeaderText("The File Is Missing Or Misspelled!");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}