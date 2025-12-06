package ela.accounts_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ChartController {

    @FXML
    private TextArea chartArea;

    @FXML
    public void initialize() {
        showChart();
    }

    @FXML
    public void refreshChartOnAction(ActionEvent event) {
        showChart();
        chartArea.appendText("\n\n(Data Refreshed at " + java.time.LocalTime.now() + ")");
    }

    private void showChart() {
        String chart = "--- INCOME VS EXPENSE CHART (DECEMBER 2025) ---\n\n";

        chart += "INCOME  (500,000):  ************************** (500k)\n";
        chart += "EXPENSE (200,000):  ********** (200k)\n";
        chart += "PROFIT  (300,000):  *************** (300k)\n\n";

        chart += "--------------------------------------------------\n";
        chart += "ANALYSIS:\n";
        chart += "1. Income is 2.5x higher than expenses.\n";
        chart += "2. Profit margin is healthy.\n";

        chartArea.setText(chart);
    }
}