package org.universityHierarchy.service;

public interface IEmployee {

    //  Function<Integer, Integer> gettingYearsOfWork(Integer year);

//gettingYearsOfWork();

    double gettingIncome();

    double gettingPercentage(int workingYears);

    double calculateNetIncomeByWorkingYears(double netIncome, double percentage);
}
