package org.universityHierarchy.entity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Student extends People {

    private int student_id;
    private double majorQualification;
    private double lowQualification;

    public Student() {
    }

    public Student(int student_id, double majorQualification, double lowQualification) {
        this.student_id = student_id;
        this.majorQualification = majorQualification;
        this.lowQualification = lowQualification;
    }


}
