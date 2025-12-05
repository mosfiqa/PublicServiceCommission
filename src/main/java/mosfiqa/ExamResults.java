package mosfiqa;

public class ExamResults {
    private String examId;
    private String roll;
    private int marks;
    private int totalMarks;
    private String meritPosition;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
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

    public String getMeritPosition() {
        return meritPosition;
    }

    public void setMeritPosition(String meritPosition) {
        this.meritPosition = meritPosition;
    }

    @Override
    public String toString() {
        return "goal15{" +
                "examId='" + examId + '\'' +
                ", roll='" + roll + '\'' +
                ", marks=" + marks +
                ", totalMarks=" + totalMarks +
                ", meritPosition='" + meritPosition + '\'' +
                '}';
    }

    public ExamResults(String examId, String roll, int marks, int totalMarks, String meritPosition) {
        this.examId = examId;
        this.roll = roll;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.meritPosition = meritPosition;




    }
}
