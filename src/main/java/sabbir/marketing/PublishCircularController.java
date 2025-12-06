package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PublishCircularController
{
    @javafx.fxml.FXML
    private DatePicker deadlinePicker;
    @javafx.fxml.FXML
    private TextArea eligibilityTextArea;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TextField circularTitleField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TextField vacanciesField;
    @javafx.fxml.FXML
    private ComboBox postNameComboBox;

    ArrayList<marketingdata> marketingdata;

    @javafx.fxml.FXML
    public void initialize() {
        postNameComboBox.getItems().addAll("Senior Officer", "Assistant Director", "Marketing Executive", "Software Engineer");
        marketingdata = new ArrayList<marketingdata>();
    }

    @javafx.fxml.FXML
    public void handleCancel(ActionEvent actionEvent) {
    eligibilityTextArea.clear();
    vacanciesField.clear();
    descriptionTextArea.clear();
    circularTitleField.clear();
    postNameComboBox.setValue("");
    }

    @javafx.fxml.FXML
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
                File f = new File("marketingdata.bin");
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;
                if(f.exists()){
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                }
                else{
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                for(marketingdata c: marketingdata){
                    oos.writeObject(c);
                }
                oos.close();
            } catch (Exception e) {
                //
            }
        }

    }

    @javafx.fxml.FXML
    public void handleSaveDraft(ActionEvent actionEvent) {
    }
}