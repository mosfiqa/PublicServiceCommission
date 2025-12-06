package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import mosfiqa.ExaminerAssignment;
import org.w3c.dom.Text;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class assign_examiners<ExamAssignment>
{
    @javafx.fxml.FXML
    private TableColumn <assign_examiners,String>idTCOL;
    @javafx.fxml.FXML
    private TableColumn<assign_examiners,String> subjectTCOL;
    @javafx.fxml.FXML
    private TableColumn<assign_examiners,String> examTCOL;
    @javafx.fxml.FXML
    private ComboBox<String> examinerComboBox;
    @javafx.fxml.FXML
    private TextField subjectTF;
    @javafx.fxml.FXML
    private TableView <assign_examiners>assignTableView;
    @javafx.fxml.FXML
    private TableColumn <assign_examiners,String>EXnameTCOL;
    @javafx.fxml.FXML
    private Text SelectExamComboBox;

    @FXML
    public void initialize() {
        // Example examiner list
        examinerComboBox.getItems().addAll("Mr. Rahman", "Ms. Jahan", "Dr. Karim");

        // Example exam ID list
        SelectExamComboBox.getItems().addAll("EXAM-101", "EXAM-102", "EXAM-103");

        // Table setup
        idTCOL.setCellValueFactory(new PropertyValueFactory<>("examId"));
        subjectTCOL.setCellValueFactory(new PropertyValueFactory<>("subject"));
        EXnameTCOL.setCellValueFactory(new PropertyValueFactory<>("examinerName"));
    }

    @javafx.fxml.FXML
    public void AddExaminerButton(ActionEvent actionEvent) {
        if (examIdComboBox.getValue() == null ||
                subjectTF.getText().isEmpty() ||
                examinerComboBox.getValue() == null) {
            new Alert(Alert.AlertType.ERROR, "Please fill all fields!").show();
            return;
        }

        String assignmentId = generateAssignmentId();
        String examId = examIdComboBox.getValue();
        String subject = subjectTF.getText();
        String examinerName = examinerComboBox.getValue();

        ExaminerAssignment assignment = new ExaminerAssignment(
                assignmentId, examId, subject, examinerName
        );

        assignmentList.add(assignment);
        assignTableView.setItems(assignmentList);

        subjectTF.clear();
        examIdComboBox.setValue(null);
        examinerComboBox.setValue(null);

        new Alert(Alert.AlertType.INFORMATION, "Examiner Assigned Successfully!").show();
    }
    }

    @javafx.fxml.FXML
    public void searchexaminarButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewexaminarButton(ActionEvent actionEvent) {
        assignmentList.clear();

        try {
            ObjectInputStream ois =
                    new assign_examiners<>(new FileInputStream("AssignmentData.bin"));

            while (true) {
                try {
                    assignmentList.add((ExaminerAssignment) ois.readObject());
                } catch (EOFException eof) {
                    break;
                }
            }

            ois.close();
            assignTableView.setItems(assignmentList);

        } catch (FileNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "No saved assignments found!").show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
}