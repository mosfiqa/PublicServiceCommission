package mosfiqa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;

public class ExamSchedule {
    private String scheduleId,examTitle,circularId,subject,time,examCenter,room,invigilators;
    private LocalDate examDate;

    public ExamSchedule(String scheduleId, String examTitle, String circularId, String subject, String time, String examCenter, String room, String invigilators, LocalDate examDate, int capacity) {
        this.scheduleId = scheduleId;
        this.examTitle = examTitle;
        this.circularId = circularId;
        this.subject = subject;
        this.time = time;
        this.examCenter = examCenter;
        this.room = room;
        this.invigilators = invigilators;
        this.examDate = examDate;
        this.capacity = capacity;
    }

    private int capacity;

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public String getCircularId() {
        return circularId;
    }

    public void setCircularId(String circularId) {
        this.circularId = circularId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExamCenter() {
        return examCenter;
    }

    public void setExamCenter(String examCenter) {
        this.examCenter = examCenter;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getInvigilators() {
        return invigilators;
    }

    public void setInvigilators(String invigilators) {
        this.invigilators = invigilators;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "goal3{" +
                "scheduleId='" + scheduleId + '\'' +
                ", examTitle='" + examTitle + '\'' +
                ", circularId='" + circularId + '\'' +
                ", subject='" + subject + '\'' +
                ", time='" + time + '\'' +
                ", examCenter='" + examCenter + '\'' +
                ", room='" + room + '\'' +
                ", invigilators='" + invigilators + '\'' +
                ", examDate=" + examDate +
                ", capacity=" + capacity +
                '}';
    }
    @FXML
    public void initialize() {

        // Fill ComboBoxes
        SubjectCBOX.getItems().addAll("Math", "English", "Bangla", "ICT");
        ExamIDCBOX.getItems().addAll("EXAM1001", "EXAM1002", "EXAM1003");

        // Table setup
        rollnoTCOL.setCellValueFactory(new PropertyValueFactory<>("rollNo"));
        marksTCOL.setCellValueFactory(new PropertyValueFactory<>("marks"));
        totalTCOL.setCellValueFactory(new PropertyValueFactory<>("totalMarks"));
        statusTCOL.setCellValueFactory(new PropertyValueFactory<>("status"));

        marksTview.setItems(examList);
    }

    @FXML
    public void loadButton(ActionEvent actionEvent) {
        examList.clear();

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

    @FXML
    public void saveButton(ActionEvent actionEvent) {
        try {
            ExamSchedule oos = new ExamSchedule(new FileOutputStream("ExamSchedule.bin"));

            for (ExamSchedule e : examList) {
                oos.writeObject(e);
            }

            oos.close();
            new Alert(Alert.AlertType.INFORMATION, "Saved successfully!").show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void searchButton(ActionEvent actionEvent) {

        String selectedExamId = ExamIDCBOX.getValue();
        String selectedSubject = SubjectCBOX.getValue();

        if (selectedExamId == null || selectedSubject == null) {
            new Alert(Alert.AlertType.WARNING, "Select exam ID and subject!").show();
            return;
        }

        ObservableList<ExamSchedule> filtered = FXCollections.observableArrayList();

        for (ExamSchedule e : ExamSchedule) {
            if (e.getExamId().equals(selectedExamId) &&
                    e.getSubject().equals(selectedSubject)) {

                filtered.add(e);
            }
        }

        marksTview.setItems(filtered);
    }

    private Object getExamId() {
    }

    @FXML
    public void approveButton(ActionEvent actionEvent) {

