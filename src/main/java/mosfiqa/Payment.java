package mosfiqa;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private String applicantId;
    private double amount;
    private LocalDate date;
    private String transactionId;
    private String method;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "goal13{" +
                "paymentId='" + paymentId + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", transactionId='" + transactionId + '\'' +
                ", method='" + method + '\'' +
                '}';
    }

    public Payment(String paymentId, String applicantId, double amount, LocalDate date, String transactionId, String method) {
        this.paymentId = paymentId;
        this.applicantId = applicantId;
        this.amount = amount;
        this.date = date;
        this.transactionId = transactionId;
        this.method = method;


    }
}
