package mosfiqa;

import java.time.LocalDate;

public class ComplaintManagement {
    private String complaintId,applicantName,forwardedTo;
    private String issue;
    private String status;

    public ComplaintManagement(String complaintId, String applicantName, String forwardedTo, String issue, String status, LocalDate date) {
        this.complaintId = complaintId;
        this.applicantName = applicantName;
        this.forwardedTo = forwardedTo;
        this.issue = issue;
        this.status = status;
        this.date = date;
    }

    private LocalDate date;

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getForwardedTo() {
        return forwardedTo;
    }

    public void setForwardedTo(String forwardedTo) {
        this.forwardedTo = forwardedTo;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;


    }

    @Override
    public String toString() {
        return "goal7{" +
                "complaintId='" + complaintId + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", forwardedTo='" + forwardedTo + '\'' +
                ", issue='" + issue + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
