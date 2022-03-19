package org.universityHierarchy;

import java.util.Date;

public class Course extends CourseInformation{
    private String courseName;
    private String courseDay;
    private Date courseTime;

    public Course() {
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

    @Override
    void takeStudentList() {

    }

    @Override
    void addStudentsToCourse() {

    }

    @Override
    void viewExam() {

    }

    @Override
    public void createWorkshop() {
        System.out.println("Workshop is created");
    }

    @Override
    public void createStudyTravel() {
        System.out.println("Study travel is created");
    }

    @Override
    public void setExams() {
        System.out.println("Exams are set");
    }

    @Override
    public void provideRecordedClasses() {
        System.out.println("Recorded lecture is provided");
    }

    @Override
    public void provideReadingMaterials() {
        System.out.println("Provided reading Material is done");
    }
}
