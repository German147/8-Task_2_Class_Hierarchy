package org.universityHierarchy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.*;


public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);


    private static final String universityName = "Cordoba University";
    private static final String universityLocation = "SouthAmercia";
    // TODO: 23/3/2022 noticeBoard's methods
    // TODO: 23/3/2022 student's methods
    // TODO: 23/3/2022 teacher's methods

    public static void main(String[] args) {

        LOGGER.debug("Hola chicos");
        System.out.println(universityName);
        System.out.println("This is located in " + universityLocation);

        UserInteractionClass user1 = new UserInteractionClass();
        String name = user1.greeting();
        user1.setUserName(name);
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
        } else if (category == 2) {
            teacher.addTeacherInformation();
            Course course = new Course();
            String[] subjects = course.addSubjectToCourse();
            course.printSubjects(subjects);
            String[] students = course.addStudentToCourse();
            course.printStudents(students);
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
