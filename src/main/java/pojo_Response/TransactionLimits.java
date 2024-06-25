package pojo_Response;

public class TransactionLimits {
    private String dailyVolumeLimit;
    private String weeklyVolumeLimit;
    private String monthlyVolumeLimit;
    private String dailyVelocityLimit;

    public String getDailyVolumeLimit() {
        return dailyVolumeLimit;
    }

    public void setDailyVolumeLimit(String dailyVolumeLimit) {
        this.dailyVolumeLimit = dailyVolumeLimit;
    }

    public String getWeeklyVolumeLimit() {
        return weeklyVolumeLimit;
    }

    public void setWeeklyVolumeLimit(String weeklyVolumeLimit) {
        this.weeklyVolumeLimit = weeklyVolumeLimit;
    }

    public String getMonthlyVolumeLimit() {
        return monthlyVolumeLimit;
    }

    public void setMonthlyVolumeLimit(String monthlyVolumeLimit) {
        this.monthlyVolumeLimit = monthlyVolumeLimit;
    }

    public String getDailyVelocityLimit() {
        return dailyVelocityLimit;
    }

    public void setDailyVelocityLimit(String dailyVelocityLimit) {
        this.dailyVelocityLimit = dailyVelocityLimit;
    }

    public String getMonthlyVelocityLimit() {
        return monthlyVelocityLimit;
    }

    public void setMonthlyVelocityLimit(String monthlyVelocityLimit) {
        this.monthlyVelocityLimit = monthlyVelocityLimit;
    }

    private String monthlyVelocityLimit;
}
