package mosfiqa;

import java.time.LocalDate;

public class goal11 {
    private String applicationId,fullName;
    private String fathersName,nid,gender,address;
    private String educationInfo;
    private LocalDate dob;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducationInfo() {
        return educationInfo;
    }

    public void setEducationInfo(String educationInfo) {
        this.educationInfo = educationInfo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "goal11{" +
                "applicationId='" + applicationId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", nid='" + nid + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", educationInfo='" + educationInfo + '\'' +
                ", dob=" + dob +
                '}';
    }

    public goal11(String applicationId, String fullName, String fathersName, String nid, String gender, String address, String educationInfo, LocalDate dob) {
        this.applicationId = applicationId;
        this.fullName = fullName;
        this.fathersName = fathersName;
        this.nid = nid;
        this.gender = gender;
        this.address = address;
        this.educationInfo = educationInfo;
        this.dob = dob;




    }
}
