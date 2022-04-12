package service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.Employee;
import service.IEmployee;

import java.util.Scanner;

public class EmployeeImpl extends EmployeeInformation implements IEmployee {

    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public int gettingYearsOfWork() {
        return 0;
    }

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
