package org.universityHierarchy;

import java.util.Scanner;

public class Employee extends EmployeeInformation {

    private int employee_Id;

    public Employee() {
    }

    public int getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
    }

    public void addEmployeeInformation() {

        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();

        System.out.println("Enter the following employee's data: ");
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        employee1.setUserName(name);
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

    }

    @Override
    public int gettingYearsOfWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of working years");
        int workingYears = scanner.nextInt();
        return workingYears;
    }

    @Override
    public double gettingIncome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base monthly income");
        double netIncome = scanner.nextInt();
        return netIncome;
    }

    @Override
    public double gettingPercentage(int workingYears) {
        double percentage;
        if (workingYears >= 7 && workingYears < 7) {
            percentage = 3;
        } else if (workingYears >= 10 && workingYears < 10) {
            percentage = 5;
        } else if (workingYears >= 10) {
            percentage = 10;
        } else percentage = 0;
        return percentage;
    }

    @Override
    public double calculateNetIncomeByWorkingYears(double netIncome, double percentage) {
        double totalSalary = netIncome + (percentage * netIncome / 100);
        return totalSalary;
    }

}
