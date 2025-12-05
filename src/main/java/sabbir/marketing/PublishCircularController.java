package sabbir.marketing;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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

    ArrayList<circular> circularlist;

    @javafx.fxml.FXML
    public void initialize() {
        postNameComboBox.getItems().addAll("Senior Officer", "Assistant Director", "Marketing Executive", "Software Engineer");
        circularlist = new ArrayList<circular>();
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
        try{
            File f = new File("circular.bin");
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
            for(circular c: circularlist){
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //
        }

    }

    @javafx.fxml.FXML
    public void handleSaveDraft(ActionEvent actionEvent) {
    }
}