package fatin;

public class Submission {
    private int submissionId;
    private String studentName;
    private String questionTitle;
    private String date;
    private String status;
    private String answer;

    public Submission(int submissionId, String studentName, String questionTitle, String date, String status, String answer) {
        this.submissionId = submissionId;
        this.studentName = studentName;
        this.questionTitle = questionTitle;
        this.date = date;
        this.status = status;
        this.answer = answer;
    }

    public int getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Submission{" +
                "submissionId=" + submissionId +
                ", studentName='" + studentName + '\'' +
                ", questionTitle='" + questionTitle + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
