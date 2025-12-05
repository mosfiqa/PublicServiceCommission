package mosfiqa;

import java.time.LocalDate;

public class ApplicantComplaint {
    private String complaintId;
    private String subject;
    private String message;
    private LocalDate date;

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "goal16{" +
                "complaintId='" + complaintId + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }

    public ApplicantComplaint(String complaintId, String subject, String message, LocalDate date) {
        this.complaintId = complaintId;
        this.subject = subject;
        this.message = message;
        this.date = date;




    }
}
