package mosfiqa;

import java.io.Serializable;
import java.time.LocalDate;

public class CircularManagement implements Serializable {
    private String title,department,description;
    private int vacancy;
    private LocalDate deadline;





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public CircularManagement(String circularId, String title, String department, String description, int vacancy, LocalDate deadline) {

        this.title = title;
        this.department = department;
        this.description = description;
        this.vacancy = vacancy;
        this.deadline = deadline;




    }

    @Override
    public String toString() {
        return "goal1{" +

                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", description='" + description + '\'' +
                ", vacancy=" + vacancy +
                ", deadline=" + deadline +
                '}';
    }
}
