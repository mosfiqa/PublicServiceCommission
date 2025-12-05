package sabbir.marketing;

import java.time.LocalDate;

public class campaing {
    int budget;
    String name, audiance, circularname, campaingdiscription, campaingchennel;
    LocalDate startdate, enddate;

    public int getBudget() {
        return budget;
    }

    public campaing(int budget, String name, String audiance, String circularname, String campaingdiscription, String campaingchennel, LocalDate startdate, LocalDate enddate) {
        this.budget = budget;
        this.name = name;
        this.audiance = audiance;
        this.circularname = circularname;
        this.campaingdiscription = campaingdiscription;
        this.campaingchennel = campaingchennel;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "campaing{" +
                "budget=" + budget +
                ", name='" + name + '\'' +
                ", audiance='" + audiance + '\'' +
                ", circularname='" + circularname + '\'' +
                ", campaingdiscription='" + campaingdiscription + '\'' +
                ", campaingchennel='" + campaingchennel + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
