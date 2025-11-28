package mosfiqa;

import java.time.LocalDate;

public class goal2 {
    private String applicantId,name,status,nid,qualification;
    private LocalDate dob;
    private boolean paymentVerified;

    public goal2(String applicantId, String name, String status, String nid, String qualification, LocalDate dob, boolean paymentVerified) {
        this.applicantId = applicantId;
        this.name = name;
        this.status = status;
        this.nid = nid;
        this.qualification = qualification;
        this.dob = dob;
        this.paymentVerified = paymentVerified;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isPaymentVerified() {
        return paymentVerified;
    }

    public void setPaymentVerified(boolean paymentVerified) {
        this.paymentVerified = paymentVerified;
    }

    @Override
    public String toString() {
        return "goal2{" +
                "applicantId='" + applicantId + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", nid='" + nid + '\'' +
                ", qualification='" + qualification + '\'' +
                ", dob=" + dob +
                ", paymentVerified=" + paymentVerified +
                '}';
    }
}
