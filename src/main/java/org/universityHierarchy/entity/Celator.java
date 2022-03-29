package org.universityHierarchy.entity;

public class Celator {

    private long celator_id;
    private String dayTime;
    private String courseInCharged;

    public Celator() {
    }

    public long getCelator_id() {
        return celator_id;
    }

    public void setCelator_id(long celator_id) {
        this.celator_id = celator_id;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getCourseInCharged() {
        return courseInCharged;
    }

    public void setCourseInCharged(String courseInCharged) {
        this.courseInCharged = courseInCharged;
    }
}
