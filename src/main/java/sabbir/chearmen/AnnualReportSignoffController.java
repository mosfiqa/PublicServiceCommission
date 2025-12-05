package sabbir.chearmen;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AnnualReportSignoffController
{
    @javafx.fxml.FXML
    private ComboBox yearSelectionComboBox;
    @javafx.fxml.FXML
    private Label dataIntegrityStatusLabel;
    @javafx.fxml.FXML
    private Label reportDisplayTitle;
    @javafx.fxml.FXML
    private TextArea annualReportArea;

    @javafx.fxml.FXML
    public void initialize() {
        yearSelectionComboBox.getItems().addAll("2023","2024","2025");
    }

    @javafx.fxml.FXML
    public void handleGenerateAnnualReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleFinalSignoff(ActionEvent actionEvent) {
    }
}