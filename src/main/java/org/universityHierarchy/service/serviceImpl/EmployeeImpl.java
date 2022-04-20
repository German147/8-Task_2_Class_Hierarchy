package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.Employee;
import org.universityHierarchy.service.IEmployee;

import java.util.Scanner;

public class EmployeeImpl extends EmployeeInformation implements IEmployee {

    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
    private static final Scanner scanner = new Scanner(System.in);


    @Override
    public double gettingIncome() {
        return 0;
    }

    @Override
    public double gettingPercentage(int workingYears) {
        return 0;
    }

    @Override
    public double calculateNetIncomeByWorkingYears(double netIncome, double percentage) {
        return 0;
    }

    @Override
    void addEmployeeInformation() {

    }
}

/**
 * this method uses a Function to get and return the years of work
 *
 * @return an integer that represent the years of work.
 */
//   @Override
//    public Function<Integer, Integer> gettingYearsOfWork() {
//
//        Function<Integer, Integer> gettingyearsOfwork = yearsOfWork -> {
//            Scanner scanner = new Scanner(System.in);
//            LOGGER.info("Enter the working years until now :");
//            int year = scanner.nextInt();
//            return year;
//        };
//        return gettingyearsOfwork;
//    }



