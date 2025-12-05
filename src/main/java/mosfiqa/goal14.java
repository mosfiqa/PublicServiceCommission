package mosfiqa;

import java.time.LocalDate;

public class goal14 {
    private String examId;
    private String rollNumber;
    private String center;
    private LocalDate date;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "goal14{" +
                "examId='" + examId + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", center='" + center + '\'' +
                ", date=" + date +
                '}';
    }

    public goal14(String examId, String rollNumber, String center, LocalDate date) {
        this.examId = examId;
        this.rollNumber = rollNumber;
        this.center = center;
        this.date = date;




    }
}
