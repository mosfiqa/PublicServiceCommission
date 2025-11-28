package ela.logistics_officer;

public class ExamCenter {
    private String centerId;
    private String centerName;
    private int capacity;
    private String allocationStatus;

    public ExamCenter() {
    }

    public ExamCenter(String centerId, String centerName, int capacity, String allocationStatus) {
        this.centerId = centerId;
        this.centerName = centerName;
        this.capacity = capacity;
        this.allocationStatus = allocationStatus;
    }

    public String getCenterId() {
        return centerId;
    }

    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAllocationStatus() {
        return allocationStatus;
    }

    public void setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
    }


    @Override
    public String toString() {
        return "ExamCenter{" +
                "centerId='" + centerId + '\'' +
                ", centerName='" + centerName + '\'' +
                '}';
    }
}