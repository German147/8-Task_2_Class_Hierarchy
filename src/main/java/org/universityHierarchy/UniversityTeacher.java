package org.universityHierarchy;

import java.util.Arrays;

public class UniversityTeacher extends Employee {

    private String department;
    private String[] teacherClasses;

    public UniversityTeacher() {

    }

    public UniversityTeacher(String department,
                             String[] teacherClasses) {
        this.department = department;
        this.teacherClasses = teacherClasses;
    }

    public UniversityTeacher(String name, String surname, String phoneNumber, int payScale) {
        super(name, surname, phoneNumber, payScale);
    }

    public UniversityTeacher(int payScale) {
        super(payScale);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getTeacherClasses() {
        return teacherClasses;
    }

    public void setTeacherClasses(String[] teacherClasses) {
        this.teacherClasses = teacherClasses;
    }

    public void calculateTeacherPay(){

    }

    public void addClasses(){}

    @Override
    public String toString() {
        return "UniversityTeacher{" +
                "department='" + department + '\'' +
                ", teacherClasses=" + Arrays.toString(teacherClasses) +
                '}';
    }
}
