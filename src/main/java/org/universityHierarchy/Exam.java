package org.universityHierarchy;


import java.util.Date;

public class Exam extends Course {
    private String examTitle;
    private Date examDateAndTime;

    public Exam() {
    }
    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public Date getExamDateAndTime() {
        return examDateAndTime;
    }

    public void setExamDateAndTime(Date examDateAndTime) {
        this.examDateAndTime = examDateAndTime;
    }

    public void addStudentsToExam() {
    }

}
