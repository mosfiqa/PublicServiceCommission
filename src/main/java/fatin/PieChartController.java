package fatin;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class PieChartController {

    @FXML
    private PieChart userPieChart;

    @FXML
    public void initialize() {


        int examinerCount = 5;
        int itAdminCount = 3;

        PieChart.Data examinerData = new PieChart.Data("Examiner", examinerCount);
        PieChart.Data itAdminData = new PieChart.Data("IT System Administrator", itAdminCount);

        userPieChart.getData().addAll(examinerData, itAdminData);
    }
}