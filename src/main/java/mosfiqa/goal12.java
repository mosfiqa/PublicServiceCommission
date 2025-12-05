package mosfiqa;

public class goal12 {
    public goal12(String applicantId, boolean photoUploaded, boolean nidUploaded, boolean certificateUploaded, boolean experienceUploaded) {
        this.applicantId = applicantId;
        this.photoUploaded = photoUploaded;
        this.nidUploaded = nidUploaded;
        this.certificateUploaded = certificateUploaded;
        this.experienceUploaded = experienceUploaded;
    }

    private String applicantId;
    private boolean photoUploaded;
    private boolean nidUploaded;
    private boolean certificateUploaded;
    private boolean experienceUploaded;

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public boolean isPhotoUploaded() {
        return photoUploaded;
    }

    public void setPhotoUploaded(boolean photoUploaded) {
        this.photoUploaded = photoUploaded;
    }

    public boolean isNidUploaded() {
        return nidUploaded;
    }

    public void setNidUploaded(boolean nidUploaded) {
        this.nidUploaded = nidUploaded;
    }

    public boolean isCertificateUploaded() {
        return certificateUploaded;
    }

    public void setCertificateUploaded(boolean certificateUploaded) {
        this.certificateUploaded = certificateUploaded;
    }

    public boolean isExperienceUploaded() {
        return experienceUploaded;
    }

    public void setExperienceUploaded(boolean experienceUploaded) {
        this.experienceUploaded = experienceUploaded;


    }

    @Override
    public String toString() {
        return "goal12{" +
                "applicantId='" + applicantId + '\'' +
                ", photoUploaded=" + photoUploaded +
                ", nidUploaded=" + nidUploaded +
                ", certificateUploaded=" + certificateUploaded +
                ", experienceUploaded=" + experienceUploaded +
                '}';
    }
}
