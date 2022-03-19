package org.universityHierarchy;

/**
 * Hello world!
 */
public class App {

    private static final String universityName = "Acme University";
    private static final String universityLocation = "SouthAmercia";


    public static void main(String[] args) {
        System.out.println(universityName);
        System.out.println("This is located in " + universityLocation);

        UserInteractionClass user1 = new UserInteractionClass();
        String name = user1.greeting();
        user1.setName(name);
        user1.welcomeUser(name);
        int category = user1.chooseCategoryUser();
        user1.chosenCategory(category);
        Student student = new Student();
        Teacher teacher = new Teacher();
        StaffEmployee staffEmployee = new StaffEmployee();
        initializingEntities(student, teacher, staffEmployee, category);

    }

    private static void initializingEntities(Student student, Teacher teacher,
                                             StaffEmployee staffEmployee, int category) {
        if (category == 1) {
            student.addStudentInformation();
// TODO: 17/3/2022 implement student methods 
        } else if (category == 2) {
            teacher.addTeacherInformation();
            System.out.println("Now let's calculate your salary");
            double netIncome = staffEmployee.gettingIncome();
            int workingYears = staffEmployee.gettingYearsOfWork();
            double percentage = staffEmployee.gettingPercentage(workingYears);
            double totalSalary = staffEmployee.calculateNetIncomeByWorkingYears(netIncome, percentage);
            System.out.println("Your total salary is " + totalSalary);

        } else if (category == 3) {
            staffEmployee.addEmployeeInformation();
            System.out.println("Now let's calculate your salary");
            double netIncome = staffEmployee.gettingIncome();
            int workingYears = staffEmployee.gettingYearsOfWork();
            double percentage = staffEmployee.gettingPercentage(workingYears);
            double totalSalary = staffEmployee.calculateNetIncomeByWorkingYears(netIncome, percentage);
            System.out.println("Your total salary is " + totalSalary);

        }
    }


}
