package pojo_Response;

public class CoolingPeriodLimits {
    private String startTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMonetaryLimit() {
        return monetaryLimit;
    }

    public void setMonetaryLimit(String monetaryLimit) {
        this.monetaryLimit = monetaryLimit;
    }

    private String endTime;
    private String monetaryLimit;
}
