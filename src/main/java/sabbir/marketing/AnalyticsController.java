package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class AnalyticsController
{
    @javafx.fxml.FXML
    private ComboBox campaignSelector;
    @javafx.fxml.FXML
    private Label conversionRateLabel;
    @javafx.fxml.FXML
    private Label successRateLabel;
    @javafx.fxml.FXML
    private TableView reportTableView;
    @javafx.fxml.FXML
    private Label budgetSpentLabel;
    @javafx.fxml.FXML
    private Label totalApplicationsLabel;
    @javafx.fxml.FXML
    private ComboBox timePeriodSelector;
    @javafx.fxml.FXML
    private PieChart performancechart;

    @javafx.fxml.FXML
    public void initialize() {
        campaignSelector.getItems().addAll("Campaign A", "Circular B");
        timePeriodSelector.getItems().addAll("Last 30 Days", "Last 90 Days");
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }
}