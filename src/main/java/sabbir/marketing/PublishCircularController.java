package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PublishCircularController
{
    @FXML
    private DatePicker deadlinePicker;
    @FXML
    private TextArea eligibilityTextArea;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private TextField circularTitleField;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextField vacanciesField;
    @FXML
    private ComboBox postNameComboBox;

    ArrayList<marketingdata> marketingdata;

    @FXML
    public void initialize() {
        postNameComboBox.getItems().addAll("Senior Officer", "Assistant Director", "Marketing Executive", "Software Engineer");
        marketingdata = new ArrayList<marketingdata>();
    }

    @FXML
    public void handleCancel(ActionEvent actionEvent) {
    eligibilityTextArea.clear();
    vacanciesField.clear();
    descriptionTextArea.clear();
    circularTitleField.clear();
    postNameComboBox.setValue("");
    }

    @FXML
    public void handlePublishCircular(ActionEvent actionEvent) {
        if(
        eligibilityTextArea.getText().isEmpty()||
        vacanciesField.getText().isEmpty()||
        descriptionTextArea.getText().isEmpty()||
        circularTitleField.getText().isEmpty()||
        postNameComboBox.getItems().isEmpty()
        ){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Fill up the form properly");
            a.show();
        }
        else {
            try{
                File marketing = new File("marketingdata.bin");
                FileOutputStream FOS = null;
                ObjectOutputStream oos = null;
                if(marketing.exists()){
                    FOS = new FileOutputStream(marketing, true);
                    oos = new AppendableObjectOutputStream(FOS);
                }
                else{
                    FOS = new FileOutputStream(marketing);
                    oos = new ObjectOutputStream(FOS);
                }
                for(marketingdata c: marketingdata){
                    oos.writeObject(c);
                }
                oos.close();
            } catch (Exception e) {
                //
            }
        }

        marketingdata marketing = new marketingdata(
                circularTitleField.getText(),
                postNameComboBox.getValue(),
                descriptionTextArea.getText(),
                startDatePicker.getValue(),
                deadlinePicker.getValue(),
                vacanciesField.getText(),
                eligibilityTextArea.getText()
        );

    }

    @FXML
    public void handleSaveDraft(ActionEvent actionEvent) {
    }
}