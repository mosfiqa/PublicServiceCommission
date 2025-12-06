package com.example;

import com.sun.javafx.binding.DoubleConstant;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class reportsController {
    @javafx.fxml.FXML
    private TableColumn<reportsController, String> resultTCOL;
    @javafx.fxml.FXML
    private ComboBox<String> cirCOBOX;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<reportsController, String> financeTCOL;
    @javafx.fxml.FXML
    private TableView<String> reportTV;
    @javafx.fxml.FXML
    private ComboBox<String> examCOBOX;
    @javafx.fxml.FXML
    private TableColumn<String, reportsController> appsummTCOL;
    @javafx.fxml.FXML
    private TableColumn<reportsController, String> examsehTCOL;

    @javafx.fxml.FXML
    public void initialize() {

        // Example values — replace with real data from your system
        cirCOBOX.getItems().addAll("CIR-001", "CIR-002", "CIR-003");
        examCOBOX.getItems().addAll("EXAM-101", "EXAM-102", "EXAM-103");

        // TableView Column Binding
        resultTCOL.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        financeTCOL.setCellValueFactory(new PropertyValueFactory<>("circularId"));
        appsummTCOL.setCellValueFactory(new PropertyValueFactory<>("examID"));
        examsehTCOL.setCellValueFactory(new PropertyValueFactory<>("generatedOn"));
    }


    @javafx.fxml.FXML
    public void viewButton(ActionEvent actionEvent) {
        ortList.clear();

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("Reports.bin")
            );

            while (true) {
                try {
                    reportList.add((reportsController) ois.readObject());
                } catch (EOFException eof) {
                    break;
                }
            }

            ois.close();
            reportTV.setItems(reportList);

        } catch (FileNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "No saved reports found!").show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("Reports.bin")
            );

            for (reportsController r : reportList) {
                oos.writeObject(r);
            }

            oos.close();
            new Alert(Alert.AlertType.INFORMATION, "Reports Saved Successfully!").show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {

        DoubleConstant cirCOBOX;
        if (cirCOBOX.getValue() == null ||
                examCOBOX.getValue() == null ||
                fromDatePicker.getValue() == null ||
                toDatePicker.getValue() == null) {

            new Alert(Alert.AlertType.ERROR, "Please fill all fields!").show();
            return;
        }

        String reportType = "General Report";
        String circularId = cirCOBOX.getValue();
        String examID = examCOBOX.getValue();

        LocalDate fromDate = fromDatePicker.getValue();
        LocalDate toDate = toDatePicker.getValue();

        // Auto generated date-time string
        String generatedOn = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        reportType report = new reportsController()
                reportType,
                circularId,
                examID,
                generatedOn,
                fromDate,
                toDate
        );

        reportlist.add(report);

        new Alert(Alert.AlertType.INFORMATION, "Report Added Successfully!").show();
    }
}

