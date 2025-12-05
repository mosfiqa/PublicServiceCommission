package mosfiqa;

import java.time.LocalDate;

public class JobCircularView {
    private String circularId,title,qualification;
    private int vacancy;
    private LocalDate deadline;

    public String getCircularId() {
        return circularId;
    }

    public void setCircularId(String circularId) {
        this.circularId = circularId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "goal10{" +
                "circularId='" + circularId + '\'' +
                ", title='" + title + '\'' +
                ", qualification='" + qualification + '\'' +
                ", vacancy=" + vacancy +
                ", deadline=" + deadline +
                '}';
    }

    public JobCircularView(String circularId, String title, String qualification, int vacancy, LocalDate deadline) {
        this.circularId = circularId;
        this.title = title;
        this.qualification = qualification;
        this.vacancy = vacancy;
        this.deadline = deadline;



    }
}
