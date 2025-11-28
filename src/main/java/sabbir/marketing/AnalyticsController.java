package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class AnalyticsController
{
    @javafx.fxml.FXML
    private ComboBox campaignSelector;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
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
    private LineChart performanceChart;

    @javafx.fxml.FXML
    public void initialize() {
        campaignSelector.getItems().addAll("Campaign A", "Circular B");
        timePeriodSelector.getItems().addAll("Last 30 Days", "Last 90 Days");
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
        System.out.println("Report Requested: " + campaignSelector.getValue() + " / " + timePeriodSelector.getValue());
    }
}