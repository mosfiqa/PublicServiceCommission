package ela.accounts_officer;

public class Payment {
    private String transactionId;
    private String applicantId;
    private int amount;
    private String status;

    public Payment() {
    }

    public Payment(String transactionId, String applicantId, int amount, String status) {
        this.transactionId = transactionId;
        this.applicantId = applicantId;
        this.amount = amount;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "transactionId='" + transactionId + '\'' +
                ", applicantId='" + applicantId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }

}