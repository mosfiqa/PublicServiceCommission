package fatin;

public class Log {
    private int logId;
    private String activity;
    private String date;
    private String user;
    private String details;

    public Log(int logId, String activity, String date, String user, String details) {
        this.logId = logId;
        this.activity = activity;
        this.date = date;
        this.user = user;
        this.details = details;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", activity='" + activity + '\'' +
                ", date='" + date + '\'' +
                ", user='" + user + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
