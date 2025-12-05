package mosfiqa;

import com.example.complaint_management;

import java.time.LocalDate;

public class complaint_management;  {
    private String complaintId,applicantName;
    private String issue;
    private String status;

    public ComplaintManagement(String complaintId, String applicantName, String issue, String status) {
        this.complaintId = complaintId;
        this.applicantName = applicantName;
        this.issue = issue;
        this.status = status;
    }
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
                ", issue='" + issue + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
