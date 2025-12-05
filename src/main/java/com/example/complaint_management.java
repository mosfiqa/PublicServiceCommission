package com.example;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.w3c.dom.Text;

import java.time.LocalDate;

public class complaint_management
{
    @javafx.fxml.FXML
    private TableColumn<LocalDate,complaint_management> dateTCOL;
    @javafx.fxml.FXML
    private TableColumn<String,complaint_management> appTCOL;
    @javafx.fxml.FXML
    private TextField subjectTF;
    @javafx.fxml.FXML
    private TableColumn<String,complaint_management> comTCOL;
    @javafx.fxml.FXML
    private TableColumn<String,complaint_management> issueTCOL;
    @javafx.fxml.FXML
    private TableView<String> compliaintTV;
    @javafx.fxml.FXML
    private TextField subjectTF1;
    @javafx.fxml.FXML
    private Text departmentTf;
    @javafx.fxml.FXML
    private TableColumn<String,complaint_management> depTCOL;

    @javafx.fxml.FXML
    public void initialize() {
        //complaint_management
        appTCOL.setCellValueFactory(new PropertyValueFactory<>("applicantName"));
        depTCOL.setCellValueFactory(new PropertyValueFactory<>("department"));
        comTCOL.setCellValueFactory(new PropertyValueFactory<>("subject"));
        issueTCOL.setCellValueFactory(new PropertyValueFactory<>("issue"));
        dateTCOL.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}