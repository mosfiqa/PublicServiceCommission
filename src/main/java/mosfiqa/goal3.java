package mosfiqa;

import java.time.LocalDate;

public class goal3 {
    private String scheduleId,examTitle,circularId,subject,time,examCenter,room,invigilators;
    private LocalDate examDate;

    public goal3(String scheduleId, String examTitle, String circularId, String subject, String time, String examCenter, String room, String invigilators, LocalDate examDate, int capacity) {
        this.scheduleId = scheduleId;
        this.examTitle = examTitle;
        this.circularId = circularId;
        this.subject = subject;
        this.time = time;
        this.examCenter = examCenter;
        this.room = room;
        this.invigilators = invigilators;
        this.examDate = examDate;
        this.capacity = capacity;
    }

    private int capacity;

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public String getCircularId() {
        return circularId;
    }

    public void setCircularId(String circularId) {
        this.circularId = circularId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExamCenter() {
        return examCenter;
    }

    public void setExamCenter(String examCenter) {
        this.examCenter = examCenter;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getInvigilators() {
        return invigilators;
    }

    public void setInvigilators(String invigilators) {
        this.invigilators = invigilators;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "goal3{" +
                "scheduleId='" + scheduleId + '\'' +
                ", examTitle='" + examTitle + '\'' +
                ", circularId='" + circularId + '\'' +
                ", subject='" + subject + '\'' +
                ", time='" + time + '\'' +
                ", examCenter='" + examCenter + '\'' +
                ", room='" + room + '\'' +
                ", invigilators='" + invigilators + '\'' +
                ", examDate=" + examDate +
                ", capacity=" + capacity +
                '}';
    }
}
