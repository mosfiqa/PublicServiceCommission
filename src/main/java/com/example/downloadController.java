package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mosfiqa.AdmitCardDownload;

import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class downloadController
{
    @javafx.fxml.FXML
    private TableView<AdmitCardDownload> downloadTV;
    @javafx.fxml.FXML
    private TableColumn <AdmitCardDownload,String>centerTCOL;
    @javafx.fxml.FXML
    private TableColumn<AdmitCardDownload, LocalDate> dateTCOL;
    @javafx.fxml.FXML
    private TableColumn<AdmitCardDownload,Integer> rollNoTCOL;
    @javafx.fxml.FXML
    private TableColumn<AdmitCardDownload,String> downloadTCOL;

    @javafx.fxml.FXML
    public void initialize(){
        centerTCOL.setCellValueFactory(new PropertyValueFactory<>("center"));
        dateTCOL.setCellValueFactory(new PropertyValueFactory<>("date"));
        rollNoTCOL.setCellValueFactory(new PropertyValueFactory<>("rollNo"));
        downloadTCOL.setCellValueFactory(new PropertyValueFactory<>("download"));


    }


    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
        String key = se.getText().trim();

        if (key.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Enter roll no or center name to search.").show();
            return;
        }

        ObservableList<AdmitCardDownload> filtered = FXCollections.observableArrayList();

        for (DownloadData d : downloadList) {

            if (String.valueOf(d.getRollNo()).equals(key) ||
                    d.getCenter().equalsIgnoreCase(key) ||
                    (d.getDate() != null && d.getDate().toString().equals(key))) {

                filtered.add(d);
            }
        }

        if (filtered.isEmpty()) {
            new Alert(Alert.AlertType.INFORMATION, "No matching data found!").show();
            return;
        }

        downloadTV.setItems(filtered);
    }

}

    @Deprecated
    public void backButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveButton(ActionEvent actionEvent) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("DownloadData.bin")
            );

            for (AdmitCardDownload d : AdmitCardDownloadList) {
                oos.writeObject(d);
            }

            oos.close();

            new Alert(Alert.AlertType.INFORMATION, "Saved Successfully!").show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


