package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EventController
{
    @javafx.fxml.FXML
    private TextField budgetField;
    @javafx.fxml.FXML
    private TextField eventNameField;
    @javafx.fxml.FXML
    private TextField timeField;
    @javafx.fxml.FXML
    private ComboBox locationTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox audienceComboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private DatePicker eventDatePicker;
    @javafx.fxml.FXML
    private TextField venueLinkField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSchedulePromotion(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCancel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSavePlan(ActionEvent actionEvent) {
    }
}