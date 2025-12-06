package sabbir.marketing;


import java.io.Serializable;
import java.time.LocalDate;

public class marketingdata implements Serializable {
    private String circularTitle, postName, jobDescription, jobEligibility, campaingname, audiance, circularname, campaingdiscription, campaingchennel;
    private int vacancy, budget;
    private LocalDate Sdate, Edate, startdate, enddate;

    public marketingdata(String circularTitle, String postName, String jobDescription, String jobEligibility, String campaingname, String audiance, String circularname, String campaingdiscription, String campaingchennel, int vacancy, int budget, LocalDate sdate, LocalDate edate, LocalDate startdate, LocalDate enddate) {
        this.circularTitle = circularTitle;
        this.postName = postName;
        this.jobDescription = jobDescription;
        this.jobEligibility = jobEligibility;
        this.campaingname = campaingname;
        this.audiance = audiance;
        this.circularname = circularname;
        this.campaingdiscription = campaingdiscription;
        this.campaingchennel = campaingchennel;
        this.vacancy = vacancy;
        this.budget = budget;
        Sdate = sdate;
        Edate = edate;
        this.startdate = startdate;
        this.enddate = enddate;
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

    public String getCampaingname() {
        return campaingname;
    }

    public void setCampaingname(String campaingname) {
        this.campaingname = campaingname;
    }

    public String getAudiance() {
        return audiance;
    }

    public void setAudiance(String audiance) {
        this.audiance = audiance;
    }

    public String getCircularname() {
        return circularname;
    }

    public void setCircularname(String circularname) {
        this.circularname = circularname;
    }

    public String getCampaingdiscription() {
        return campaingdiscription;
    }

    public void setCampaingdiscription(String campaingdiscription) {
        this.campaingdiscription = campaingdiscription;
    }

    public String getCampaingchennel() {
        return campaingchennel;
    }

    public void setCampaingchennel(String campaingchennel) {
        this.campaingchennel = campaingchennel;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public LocalDate getSdate() {
        return Sdate;
    }

    public void setSdate(LocalDate sdate) {
        Sdate = sdate;
    }

    public LocalDate getEdate() {
        return Edate;
    }

    public void setEdate(LocalDate edate) {
        Edate = edate;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "marketingdata{" +
                "circularTitle='" + circularTitle + '\'' +
                ", postName='" + postName + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobEligibility='" + jobEligibility + '\'' +
                ", campaingname='" + campaingname + '\'' +
                ", audiance='" + audiance + '\'' +
                ", circularname='" + circularname + '\'' +
                ", campaingdiscription='" + campaingdiscription + '\'' +
                ", campaingchennel='" + campaingchennel + '\'' +
                ", vacancy=" + vacancy +
                ", budget=" + budget +
                ", Sdate=" + Sdate +
                ", Edate=" + Edate +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}