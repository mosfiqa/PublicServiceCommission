package mosfiqa;

import java.time.LocalDate;

public class goal4 {
    private String applicantId,name,rollNumber,examId,center;
    private LocalDate date;

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
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
        return "goal4{" +
                "applicantId='" + applicantId + '\'' +
                ", name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", examId='" + examId + '\'' +
                ", center='" + center + '\'' +
                ", date=" + date +
                '}';
    }

    public goal4(String name, String applicantId, String rollNumber, String examId, String center, LocalDate date) {
        this.name = name;
        this.applicantId = applicantId;
        this.rollNumber = rollNumber;
        this.examId = examId;
        this.center = center;
        this.date = date;




    }
}
