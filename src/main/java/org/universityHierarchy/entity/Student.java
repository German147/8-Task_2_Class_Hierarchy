package org.universityHierarchy.entity;


public class Student extends People {

    private int student_id;
    private double majorQualification;
    private double lowQualification;

    public Student() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public double getMajorQualification() {
        return majorQualification;
    }

    public void setMajorQualification(double majorQualification) {
        this.majorQualification = majorQualification;
    }

    public double getLowQualification() {
        return lowQualification;
    }

    public void setLowQualification(double lowQualification) {
        this.lowQualification = lowQualification;
    }
}
