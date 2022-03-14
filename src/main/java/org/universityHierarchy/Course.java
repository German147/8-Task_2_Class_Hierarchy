package org.universityHierarchy;

import java.util.Date;

public class Course {
    private String courseName;
    private String courseDay;
    private Date courseTime;

    public Course() {
    }

    public Course(String courseName, String courseDay, Date courseTime) {
        this.courseName = courseName;
        this.courseDay = courseDay;
        this.courseTime = courseTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDay() {
        return courseDay;
    }

    public void setCourseDay(String courseDay) {
        this.courseDay = courseDay;
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public void addStudentsToCourse() {
    }

    public void viewExam() {

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDay='" + courseDay + '\'' +
                ", courseTime=" + courseTime +
                '}';
    }
}
