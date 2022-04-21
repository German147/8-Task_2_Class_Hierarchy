package org.universityHierarchy.entity;


import org.universityHierarchy.HomeWork_ENUM_Lecture_9.EGender;

import java.util.Date;
import java.util.Objects;

public class Student extends People {

    private int student_id;
    private Date entranceToUniversity;
    private EGender gender;

    public Student() {
    }

    public Student(int student_id, Date entranceToUniversity, EGender gender) {
        this.student_id = student_id;
        this.entranceToUniversity = entranceToUniversity;
        this.gender = gender;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Date getEntranceToUniversity() {
        return entranceToUniversity;
    }

    public void setEntranceToUniversity(Date entranceToUniversity) {
        this.entranceToUniversity = entranceToUniversity;
    }

    @Override
    public EGender getGender() {
        return gender;
    }

    @Override
    public void setGender(EGender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudent_id() == student.getStudent_id() && Objects.equals(getEntranceToUniversity(), student.getEntranceToUniversity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudent_id(), getEntranceToUniversity());
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", entranceToUniversity=" + entranceToUniversity +
                '}';
    }
}
