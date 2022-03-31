package org.universityHierarchy.entity;


public class Celator<S, U> {

    private long celator_id;
    private S dayTime;
    private U courseInCharged;

    public Celator() {
    }

    public long getCelator_id() {
        return celator_id;
    }

    public void setCelator_id(long celator_id) {
        this.celator_id = celator_id;
    }

    public S getDayTime() {
        return dayTime;
    }

    public void setDayTime(S dayTime) {
        this.dayTime = dayTime;
    }

    public U getCourseInCharged() {
        return courseInCharged;
    }

    public void setCourseInCharged(U courseInCharged) {
        this.courseInCharged = courseInCharged;
    }
}
