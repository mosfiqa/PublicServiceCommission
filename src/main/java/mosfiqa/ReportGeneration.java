package mosfiqa;

import java.time.LocalDate;

public class ReportGeneration {

    private String reportType,circularId,examID,generatedOn;
    private LocalDate fromDate,toDate;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getCircularId() {
        return circularId;
    }

    public void setCircularId(String circularId) {
        this.circularId = circularId;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getGeneratedOn() {
        return generatedOn;
    }

    public void setGeneratedOn(String generatedOn) {
        this.generatedOn = generatedOn;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "goal8{" +
                "reportType='" + reportType + '\'' +
                ", circularId='" + circularId + '\'' +
                ", examID='" + examID + '\'' +
                ", generatedOn='" + generatedOn + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }

    public ReportGeneration(String reportType, String circularId, String examID, String generatedOn, LocalDate fromDate, LocalDate toDate) {
        this.reportType = reportType;
        this.circularId = circularId;
        this.examID = examID;
        this.generatedOn = generatedOn;
        this.fromDate = fromDate;
        this.toDate = toDate;




    }
}
