package com.example;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;

public class paymentController
{
    @javafx.fxml.FXML
    private TableColumn dateTCOL;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TableColumn idTCOL;
    @javafx.fxml.FXML
    private TableColumn traidTCOL;
    @javafx.fxml.FXML
    private TableColumn amountTCOL;
    @javafx.fxml.FXML
    private TextField methodTF;
    @javafx.fxml.FXML
    private ComboBox methodCBOX;
    @javafx.fxml.FXML
    private ComboBox appliCBOX;
    @javafx.fxml.FXML
    private TextField tranTF;
    @javafx.fxml.FXML
    private TableColumn paymentTCOL;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TableView paymentTV;

    @javafx.fxml.FXML
    public void initialize() {
        paymentTCOL.setCellValueFactory(new PropertyValueFactory<>("paymentId"));
        applicantI.setCellValueFactory(new PropertyValueFactory<>("applicantId"));
        amountTCOL.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateTCOL.setCellValueFactory(new PropertyValueFactory<>("date"));
        methodTCOL.setCellValueFactory(new PropertyValueFactory<>("method"));
        transTCOL.setCellValueFactory(new PropertyValueFactory<>("transactionId"));

        paymentTV.setItems(paymentList);
    }

    @Deprecated
    public void paymentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
    }
}