package org.universityHierarchy;

public interface IEmployee {

     int gettingYearsOfWork();

     double gettingIncome();

     double gettingPercentage(int workingYears);

    double calculateNetIncomeByWorkingYears(double netIncome, double percentage);
}
