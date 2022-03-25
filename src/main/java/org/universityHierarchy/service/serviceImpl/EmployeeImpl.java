package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.Employee;
import org.universityHierarchy.exceptions.PercentageNotFoundException;
import org.universityHierarchy.service.IEmployee;

import java.util.Scanner;

public class EmployeeImpl extends EmployeeInformation implements IEmployee {

    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addEmployeeInformation() {
        Employee employee1 = new Employee();
        System.out.println("Enter the following employee's data: ");
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        employee1.setName(name);
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        employee1.setSurname(surname);
        System.out.println("Enter your phone number");
        String phone = scanner.nextLine();
        employee1.setPhoneNumber(phone);
        System.out.println("Enter your neighborhood");
        String neighborhood = scanner.nextLine();
        employee1.setNeighborhoodName(neighborhood);
        System.out.println("Enter the state you live");
        String state = scanner.nextLine();
        employee1.setStateName(state);
        System.out.println("Enter country name");
        String country = scanner.nextLine();
        employee1.setCountryName(country);
        LOGGER.info("All employee information was set");
    }

    @Override
    public int gettingYearsOfWork() {
        LOGGER.info("Please, enter the number of working years");
        int workingYears = scanner.nextInt();
        LOGGER.info("The Working years was set");
        return workingYears;
    }

    @Override
    public double gettingIncome() {
        LOGGER.info("Enter the base monthly income");
        double netIncome = scanner.nextInt();
        return netIncome;
    }

    @Override
    public double gettingPercentage(int workingYears) {
        double percentage;
        try {
            if (workingYears >= 7 && workingYears < 7) {
                percentage = 3;
            } else if (workingYears >= 10 && workingYears < 10) {
                percentage = 5;
            } else if (workingYears >= 10) {
                percentage = 10;
            } else percentage = 0;
            return percentage;
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new PercentageNotFoundException("Enter a number from 1 to 30");
        }
    }

    @Override
    public double calculateNetIncomeByWorkingYears(double netIncome, double percentage) {
        double totalSalary = netIncome + (percentage * netIncome / 100);
        return totalSalary;
    }
}
