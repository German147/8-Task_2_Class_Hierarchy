package org.universityHierarchy.entity;


import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudent_id() == student.getStudent_id() && Double.compare(student.getMajorQualification(), getMajorQualification()) == 0 && Double.compare(student.getLowQualification(), getLowQualification()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudent_id(), getMajorQualification(), getLowQualification());
    }
}
