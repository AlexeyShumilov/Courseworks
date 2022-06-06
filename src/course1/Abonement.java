package course1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum Abonement {

    ONEDAY(1, "08:00:00", "22:00:00",true, true, false),
    MORNING(365, "08:00:00", "16:00:00", false, true, true),
    FULL(365, "08:00:00", "22:00:00", true, true, true);

    private LocalTime startTime;
    private LocalTime endTime;
    private boolean swim;
    private boolean gym;
    private boolean group;
    private int days;

    Abonement(int days, String startTime, String endTime, boolean swim, boolean gym, boolean group) {
        this.days = days;
        this.startTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.endTime = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        this.swim = swim;
        this.gym = gym;
        this.group = group;
    }

    public int getDays() {
        return days;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean isSwim() {
        return swim;
    }

    public boolean isGym() {
        return gym;
    }

    public boolean isGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Abonement{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", swim=" + swim +
                ", gym=" + gym +
                ", group=" + group +
                ", days=" + days +
                '}';
    }
}
