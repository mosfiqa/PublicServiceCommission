package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mosfiqa.MarksVerification;

import java.io.*;

public class marks_verification {
    @javafx.fxml.FXML
    private TableColumn<marks_verification, Integer> totalTCOL;
    @javafx.fxml.FXML
    private ComboBox<String> SubjectCBOX;
    @javafx.fxml.FXML
    private TableColumn<marks_verification, String> rollno;
    @javafx.fxml.FXML
    private TableColumn<marks_verification, String> statusTCOL;
    @javafx.fxml.FXML
    private ComboBox<String> ExamIDCBOX;
    @javafx.fxml.FXML
    private TableView<marks_verification> marksTview;
    @javafx.fxml.FXML
    private TableColumn<marks_verification, Integer> marksTCOL;

    @javafx.fxml.FXML
    public void initialize() {
        // Fill sample ComboBox data (replace with real data later)
        SubjectCBOX.getItems().addAll("Math", "English", "ICT");
        ExamIDCBOX.getItems().addAll("EXAM-101", "EXAM-102", "EXAM-103");

        // Map TableView columns
        rollnoTCOL.setCellValueFactory(new PropertyValueFactory<>("rollno"));
        statusTCOL.setCellValueFactory(new PropertyValueFactory<>("status"));
        marksTCOL.setCellValueFactory(new PropertyValueFactory<>("marks"));
        totalTCOL.setCellValueFactory(new PropertyValueFactory<>("totalMarks"));
    }

    @Deprecated
    public void searchButton(ActionEvent actionEvent) {
        String key = searchTF.getText().trim();

        if (key.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Enter roll or exam ID to search!").show();
            return;
        }

        ObservableList<MarksVerification> filtered = FXCollections.observableArrayList();

        for (MarksVerification mv : marks_verificationList) {
            if (mv.getRoll().equalsIgnoreCase(key) ||
                    mv.getExamId().equalsIgnoreCase(key)) {
                filtered.add(mv);
            }
        }

        if (filtered.isEmpty()) {
            new Alert(Alert.AlertType.INFORMATION, "No matching result found!").show();
        }

        marksTview.setItems(filtered);
    }

    // ---------------------- BACK BUTTON ----------------------
    @FXML
    public void backButton(ActionEvent actionEvent) {

    }
    
    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("MarksVerification.bin")
            );

            for (MarksVerification mv : marksList) {
                oos.writeObject(mv);
            }

            oos.close();
            new Alert(Alert.AlertType.INFORMATION, "Saved Successfully!").show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewButton(ActionEvent actionEvent) {
        ObservableList<marks_verification> marksList;
        marksList.clear();

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("MarksVerification.bin")
            );

            while (true) {
                try {
                    marksList.add((MarksVerification) ois.readObject());
                } catch (EOFException eof) {
                    break;
                }
            }

            ois.close();
            marksTview.setItems(marksList);

        } catch (FileNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "No saved data found!").show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    @FXML
    public void searchButton(ActionEvent actionEvent) {

        String key = searchTF.getText().trim();

        if (key.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Enter roll or exam ID to search!").show();
            return;
        }

        ObservableList<MarksVerification> filtered = FXCollections.observableArrayList();

        for (MarksVerification mv : marksList) {
            if (mv.getRoll().equalsIgnoreCase(key) ||
                    mv.getExamId().equalsIgnoreCase(key)) {
                filtered.add(mv);
            }
        }

        if (filtered.isEmpty()) {
            new Alert(Alert.AlertType.INFORMATION, "No matching result found!").show();
        }

        marksTview.setItems(filtered);
    }


    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
    }
}