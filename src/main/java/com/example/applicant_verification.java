package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import mosfiqa.ApplicantVerification;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class applicant_verification
{
    @javafx.fxml.FXML
    private TableColumn<applicant_verification,String> nameTableCOL;
    @javafx.fxml.FXML
    private RadioButton rejectRadioButton;
    @javafx.fxml.FXML
    private TextField AgeTF;
    @javafx.fxml.FXML
    private TableColumn<applicant_verification,String> AIDTableCOL;
    @javafx.fxml.FXML
    private TextField NIDTF;
    @javafx.fxml.FXML
    private TableColumn<applicant_verification,String> viewTCOL;
    @javafx.fxml.FXML
    private TableView <applicant_verification>TableView;
    @javafx.fxml.FXML
    private TextArea remarkTA;
    @javafx.fxml.FXML
    private TextField NameTF;
    @javafx.fxml.FXML
    private RadioButton ApproveRadioButton;
    @javafx.fxml.FXML
    private TableColumn<applicant_verification,String> STATUSTCOL;

    @javafx.fxml.FXML
    public void initialize() {
        // Set radio button group
        ToggleGroup statusGroup;
        ApproveRadioButton.setToggleGroup(statusGroup);
        rejectRadioButton.setToggleGroup(statusGroup);

        // Table column mapping
        AIDTableCOL.setCellValueFactory(new PropertyValueFactory<>("applicantId"));
        nameTableCOL.setCellValueFactory(new PropertyValueFactory<>("name"));
        viewTCOL.setCellValueFactory(new PropertyValueFactory<>("nid"));
        STATUSTCOL.setCellValueFactory(new PropertyValueFactory<>("status"));


    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        String keyword = NameTF.getText().trim();

        if (keyword.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Enter Applicant Name or ID to search!").show();
            return;
        }

        ObservableList<ApplicantVerification> result = FXCollections.observableArrayList();

        for (ApplicantVerification ap : applicantList) {
            if (ap.getApplicantId().equalsIgnoreCase(keyword) ||
                    ap.getName().equalsIgnoreCase(keyword))
            {
                result.add(ap);
            }
        }

        ApplicantTableView.setItems(result);
    }

}

    @javafx.fxml.FXML
    public void viewButton(ActionEvent actionEvent) {
        ObservableList<Object> applicantList;
        applicantList.clear();

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("ApplicantVerification.bin"));

            while (true) {
                try {
                    applicantList.add((ApplicantVerification) ois.readObject());
                } catch (EOFException eof) {
                    break;
                }
            }

            ois.close();
            TableView<Object> ApplicantTableView;
            ApplicantTableView.setItems(applicantList);

        } catch (FileNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "No saved data found!").show();
        } catch (Exception e) {
            e.printStackTrace();
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }
}