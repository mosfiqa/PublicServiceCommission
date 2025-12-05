package mosfiqa;

import java.time.LocalDate;

public class goal6 {
    private String examId, subject,roll,status;
    private int marks,totalMarks;
    private LocalDate uploadTime;

    @Override
    public String toString() {
        return "goal6{" +
                "examId='" + examId + '\'' +
                ", subject='" + subject + '\'' +
                ", roll='" + roll + '\'' +
                ", status='" + status + '\'' +
                ", marks=" + marks +
                ", totalMarks=" + totalMarks +
                ", uploadTime=" + uploadTime +
                '}';
    }

    public goal6(String examId, String subject, String roll, String status, int marks, int totalMarks, LocalDate uploadTime) {
        this.examId = examId;
        this.subject = subject;
        this.roll = roll;
        this.status = status;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.uploadTime = uploadTime;


    }
}
