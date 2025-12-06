package com.example;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mosfiqa.ExamSchedule;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class exam_scheduleControler
{
    @javafx.fxml.FXML
    private TableColumn<Integer, ExamSchedule> totalTCOL;
    @javafx.fxml.FXML
    private ComboBox SubjectCBOX;
    @javafx.fxml.FXML
    private TableColumn<Integer,ExamSchedule> rollno;
    @javafx.fxml.FXML
    private TableColumn<String,ExamSchedule> statusTCOL;
    @javafx.fxml.FXML
    private ComboBox ExamIDCBOX;
    @javafx.fxml.FXML
    private TableView<ExamSchedule> marksTview;
    @javafx.fxml.FXML
    private TableColumn <Integer,ExamSchedule>marksTCOL;

    @javafx.fxml.FXML
    public void initialize() {

        // Fill ComboBoxes
        SubjectCBOX.getItems().addAll("Math", "English", "Bangla", "ICT");
        ExamIDCBOX.getItems().addAll("EXAM1001", "EXAM1002", "EXAM1003");

        // Table setup
        TableColumn<Object, Object> rollnoTCOL;
        rollnoTCOL.setCellValueFactory(new PropertyValueFactory<>("rollNo"));
        marksTCOL.setCellValueFactory(new PropertyValueFactory<>("marks"));
        totalTCOL.setCellValueFactory(new PropertyValueFactory<>("totalMarks"));
        statusTCOL.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {

        try {
            ExamSchedule ois = new ExamSchedule(new FileInputStream("ExamSchedule.bin"));

            while (true) {
                try {
                    ExamSchedule e = (ExamSchedule) ois.readObject();
                    examList.add(e);

                } catch (EOFException ex) { break; }
            }

            ois.close();
            marksTview.refresh();

        } catch (FileNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "No saved exam schedule found!").show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {
    }
}