package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CreateCampaignController
{
    @javafx.fxml.FXML
    private TextArea channelsTextArea;
    @javafx.fxml.FXML
    private TextField budgetField;
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private ComboBox circularComboBox;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TextField campaignNameField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TextField targetAudienceField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleCancel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCreateCampaign(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveDraft(ActionEvent actionEvent) {
    }
}