package ela.accounts_officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

public class ChartController {

    @FXML private PieChart pieChart;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void loadChartButtonOnAction(ActionEvent event) {
        ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList();

        chartData.add(new PieChart.Data("Exam Fees (Income)", 50000));
        chartData.add(new PieChart.Data("Printing Costs (Expense)", 15000));
        chartData.add(new PieChart.Data("Staff Salaries (Expense)", 20000));
        chartData.add(new PieChart.Data("Logistics (Expense)", 5000));

        pieChart.setData(chartData);

        statusLabel.setText("Status: Chart Loaded Successfully.");
    }
}