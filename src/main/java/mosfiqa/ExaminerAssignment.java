package mosfiqa;

public class ExaminerAssignment {
    private String assignmentId;
    private String examId;
    private String subject;

    public ExaminerAssignment(String assignmentId, String examId, String subject, String examinerName) {
        this.assignmentId = assignmentId;
        this.examId = examId;
        this.subject = subject;
        this.examinerName = examinerName;
    }

    private String examinerName;

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
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

    public String getExaminerName() {
        return examinerName;
    }

    @Override
    public String toString() {
        return "goal5{" +
                "assignmentId='" + assignmentId + '\'' +
                ", examId='" + examId + '\'' +
                ", subject='" + subject + '\'' +
                ", examinerName='" + examinerName + '\'' +
                '}';
    }

    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;


    }
}
