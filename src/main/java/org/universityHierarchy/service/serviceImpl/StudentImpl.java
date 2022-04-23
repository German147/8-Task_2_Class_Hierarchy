package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.People;
import org.universityHierarchy.service.IStudent;

import java.util.Scanner;


public class StudentImpl extends People implements IStudent {

    private static final Logger LOGGER = LogManager.getLogger(StudentImpl.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] qualifications;

    @Override
    public int getExamsTotalAverageQualifications(double qualifications, int examsNumber) {
        return 0;
    }

    @Override
    public int setExamsQuantity() {
        return 0;
    }

    @Override
    public void addStudentInformation() {

    }

    @Override
    public int getHighestQualification(int[] qualifications) {
        return 0;
    }

    @Override
    public int getLowestQualification(int[] qualifications) {
        return 0;
    }

    @Override
    public int[] setQualificationsExams(int quantityExams) {
        return new int[0];
    }

    @Override
    public double calculateSumOfQualifications(int[] qualifications) {
        return 0;
    }


}
