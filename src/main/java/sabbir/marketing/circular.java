package sabbir.marketing;


import java.io.Serializable;
import java.time.LocalDate;

public class circular implements Serializable {
    private String circularTitle, postName, jobDescription, jobEligibility;
    private int vacancy;
    private LocalDate Sdob, Edob;

    public circular(String circularTitle, LocalDate edob, LocalDate sdob, int vacancy, String jobEligibility, String jobDescription, String postName) {
        this.circularTitle = circularTitle;
        Edob = edob;
        Sdob = sdob;
        this.vacancy = vacancy;
        this.jobEligibility = jobEligibility;
        this.jobDescription = jobDescription;
        this.postName = postName;
    }

    public String getCircularTitle() {
        return circularTitle;
    }

    public void setCircularTitle(String circularTitle) {
        this.circularTitle = circularTitle;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobEligibility() {
        return jobEligibility;
    }

    public void setJobEligibility(String jobEligibility) {
        this.jobEligibility = jobEligibility;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public LocalDate getSdob() {
        return Sdob;
    }

    public void setSdob(LocalDate sdob) {
        Sdob = sdob;
    }

    public LocalDate getEdob() {
        return Edob;
    }

    public void setEdob(LocalDate edob) {
        Edob = edob;
    }

    @Override
    public String toString() {
        return "circular{" +
                "circularTitle='" + circularTitle + '\'' +
                ", postName='" + postName + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobEligibility='" + jobEligibility + '\'' +
                ", vacancy=" + vacancy +
                ", Sdob=" + Sdob +
                ", Edob=" + Edob +
                '}';
    }
}


