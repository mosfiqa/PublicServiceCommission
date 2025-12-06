package mosfiqa;

import java.time.LocalDate;

public class MarksVerification {
    private String examId, subject,roll,status;
    private int marks,totalMarks;


    @Override
    public String toString() {
        return "goal6{" +
                "examId='" + examId + '\'' +
                ", subject='" + subject + '\'' +
                ", roll='" + roll + '\'' +
                ", status='" + status + '\'' +
                ", marks=" + marks +
                ", totalMarks=" + totalMarks +
                '}';
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public MarksVerification(String examId, String subject, String roll, String status, int marks, int totalMarks ) {
        this.examId = examId;
        this.subject = subject;
        this.roll = roll;
        this.status = status;
        this.marks = marks;
        this.totalMarks = totalMarks;



    }
}
