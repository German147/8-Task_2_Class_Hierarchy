package org.universityHierarchy;

public class Student extends People {

    private double majorQualification;
    private double lowQualification;
    private double averagePoints;

    public Student() {
    }

    public Student(double majorQualification, double lowQualification,
                   double averagePoints) {
        this.majorQualification = majorQualification;
        this.lowQualification = lowQualification;
        this.averagePoints = averagePoints;
    }

    public Student(String name, String surname, String phoneNumber,
                   double majorQualification, double lowQualification,
                   double averagePoints) {
        super(name, surname, phoneNumber);
        this.majorQualification = majorQualification;
        this.lowQualification = lowQualification;
        this.averagePoints = averagePoints;
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

    public double getAveragePoints() {
        return averagePoints;
    }

    public void setAveragePoints(double averagePoints) {
        this.averagePoints = averagePoints;
    }

    public double getAveragePoint() {
        return averagePoints;

    }

    public void showStudentInformation(String name, String surname,
                                       String phoneNumber) {
    }


    @Override
    public String toString() {
        return "Student{" +
                "majorQualification='" + majorQualification + '\'' +
                ", lowQualification='" + lowQualification + '\'' +
                ", averagePoints=" + averagePoints +
                '}';
    }
}
