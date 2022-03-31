package org.universityHierarchy.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.exceptions.StudentNotSetInformation;
import org.universityHierarchy.service.serviceImpl.TeacherInformation;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Teacher extends People{

    private static final Logger LOGGER = LogManager.getLogger(Teacher.class);
    private static final Scanner scanner = new Scanner(System.in);
    private String department;
    private String[] teacherClasses;

    public Teacher() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getDepartment(), teacher.getDepartment()) && Arrays.equals(getTeacherClasses(), teacher.getTeacherClasses());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDepartment());
        result = 31 * result + Arrays.hashCode(getTeacherClasses());
        return result;
    }
}

