package org.universityHierarchy.service;

public interface IStudent {

    int STUDENT_LENGTH = 5;

    int getExamsTotalAverageQualifications(double qualifications,int examsNumber );

    int setExamsQuantity();

    void addStudentInformation();

    int getHighestQualification(int[] qualifications);

    int getLowestQualification(int[] qualifications);

    int[] setQualificationsExams(int quantityExams);

    double calculateSumOfQualifications(int[] qualifications);




}
