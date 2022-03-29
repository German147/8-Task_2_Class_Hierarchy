package org.universityHierarchy.entity;


public class Celator<T,H> {

    private long celator_id;
    private T dayTime;
    private H courseInCharged;

    public Celator() {
    }

    public long getCelator_id() {
        return celator_id;
    }

    public void setCelator_id(long celator_id) {
        this.celator_id = celator_id;
    }

    public T getDayTime() {
        return dayTime;
    }

    public void setDayTime(T dayTime) {
        this.dayTime = dayTime;
    }

    public H getCourseInCharged() {
        return courseInCharged;
    }

    public void setCourseInCharged(H courseInCharged) {
        this.courseInCharged = courseInCharged;
    }
}
