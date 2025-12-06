package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import mosfiqa.CircularManagement;

import java.io.*;
import java.time.LocalDate;
import java.util.EventObject;

public class circularmanagmentController
{
    @javafx.fxml.FXML
    private TableColumn<CircularManagement, String> QualificationTCOL;
    @javafx.fxml.FXML
    private Text De;
    @javafx.fxml.FXML
    private TableColumn<CircularManagement, String> jobTCOL;
    @javafx.fxml.FXML
    private Text DescriptionTA;
    @javafx.fxml.FXML
    private Text DeadlineDatePicker;
    @javafx.fxml.FXML
    private Text DepartmentTF;
    @javafx.fxml.FXML
    private Text VacancyTF;
    @javafx.fxml.FXML
    private TableColumn<CircularManagement, String> DeadlineTCOL;
    @javafx.fxml.FXML
    private TableColumn<CircularManagement, String>DepartmentTCOL;
    @javafx.fxml.FXML
    private TableColumn<CircularManagement, String> VacancyTCOL;
    @javafx.fxml.FXML
    private Text QualificationTA;
    @javafx.fxml.FXML
    private TableColumn<CircularManagement, String> DescriptionTCOL;
    @javafx.fxml.FXML
    private TextArea qualificationLabel;
    @javafx.fxml.FXML
    private TableView<CircularManagement> circularManagementTableview;
    @javafx.fxml.FXML
    private TextArea descriptionLabel;
    @javafx.fxml.FXML
    private TextField DepartmentTF1;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField JobTitleTF;
    @javafx.fxml.FXML
    private TextField VacancyTF11;
    //****

ObservableList<CircularManagement> circularList= FXCollections.observableArrayList();
    private EventObject event;


    @javafx.fxml.FXML
    public void initialize() {

        jobTCOL.setCellValueFactory(new PropertyValueFactory<>("title"));
        QualificationTCOL.setCellValueFactory(new PropertyValueFactory<>("qualification"));
        DepartmentTCOL.setCellValueFactory(new PropertyValueFactory<>("department"));
        VacancyTCOL.setCellValueFactory(new PropertyValueFactory<>("vacancy"));
        DescriptionTCOL.setCellValueFactory(new PropertyValueFactory<>("description"));
        DeadlineTCOL.setCellValueFactory(new PropertyValueFactory<>("deadline"));
    }



    @javafx.fxml.FXML
    public void addCircularOnAction(ActionEvent actionEvent) {
    //    public CircularManagement(String circularId, String title, String department, String description, int vacancy, LocalDate deadline)
        String title = JobTitleTF.getText();
        String department = DepartmentTF1.getText();
        String description = descriptionLabel.getText();
        String qualification = qualificationLabel.getText();
        int vacancy = Integer.parseInt(VacancyTF11.getText());
        LocalDate deadline = datePicker.getValue();

        CircularManagement circular = new CircularManagement(title, department,
                description, qualification, vacancy, deadline);

        circularList.add(circular);
        circularManagementTableview.setItems(circularList);

        JobTitleTF.clear();
        DepartmentTF1.clear();
        VacancyTF11.clear();
        descriptionLabel.clear();
        qualificationLabel.clear();
        datePicker.setValue(null);
}

    @javafx.fxml.FXML
    public void viewCircularOnAction(ActionEvent actionEvent) {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("CircularData.bin")
            );

            circularList.clear();

            while (true) {
                try {
                    CircularManagement c = (CircularManagement) ois.readObject();
                    circularList.add(c);
                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();
            circularManagementTableview.setItems(circularList);//******

        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "NO DATA FOUND!").show();
        }


    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/publicservicecommission/mosfiqa/user_1_dashborad.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @javafx.fxml.FXML
    public void saveCircularOnAction(ActionEvent actionEvent) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("CircularData.bin")//Change File Name
            );

            for (CircularManagement c : circularList) {
                oos.writeObject(c);
            }

            oos.close();

            circularList.clear();//Clear the observable list
            circularManagementTableview.refresh();// refresh the Table

            new Alert(Alert.AlertType.INFORMATION, "Saved Successfully!").show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}