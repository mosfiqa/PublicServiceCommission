package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class CandidateExperienceController
{
    @javafx.fxml.FXML
    private ComboBox timeRangeComboBox;
    @javafx.fxml.FXML
    private Label avgRatingLabel;
    @javafx.fxml.FXML
    private Label npsLabel;
    @javafx.fxml.FXML
    private BarChart ratingBreakdownChart;
    @javafx.fxml.FXML
    private Label totalResponsesLabel;
    @javafx.fxml.FXML
    private ComboBox campaignFilterComboBox;
    @javafx.fxml.FXML
    private TableView feedbackTableView;
    @javafx.fxml.FXML
    private TextArea actionPlanArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSaveActionPlan(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLoadFeedback(ActionEvent actionEvent) {
    }
}