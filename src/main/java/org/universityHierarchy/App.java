package org.universityHierarchy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.StaffEmployee;
import org.universityHierarchy.entity.Teacher;
import org.universityHierarchy.entity.UserInteractionClass;
import org.universityHierarchy.service.ICourse;
import org.universityHierarchy.service.IEmployee;
import org.universityHierarchy.service.INoticeBoard;
import org.universityHierarchy.service.serviceImpl.CourseImpl;
import org.universityHierarchy.service.serviceImpl.EmployeeImpl;
import org.universityHierarchy.service.serviceImpl.NoticeBoardImpl;
import org.universityHierarchy.service.serviceImpl.StudentImpl;


public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String universityName = "Cordoba University";
    private static final String universityLocation = "SouthAmercia";
    // TODO: 23/3/2022 teacher's methods
    // TODO: 24/3/2022 analyze clean

    public static void main(String[] args) {

        System.out.println(universityName);
        System.out.println("This is located in " + universityLocation);

        UserInteractionClass user1 = new UserInteractionClass();
        String name = user1.greeting();
        user1.setUserName(name);
        user1.welcomeUser(name);
        int category = user1.chooseCategoryUser();
        user1.chosenCategory(category);
        StudentImpl student = new StudentImpl();
        Teacher teacher = new Teacher();
        StaffEmployee staffEmployee = new StaffEmployee();
        initializingEntities(student, teacher, staffEmployee, category);

    }

    private static void initializingEntities(StudentImpl student, Teacher teacher,
                                             StaffEmployee staffEmployee, int category) {
        if (category == 1) {
            LOGGER.info("Let's see some news on the NoticeBoard");
            INoticeBoard notice = new NoticeBoardImpl();
            notice.showYearlyPlanningTopics();
            notice.showDateExams();
            notice.showResultQualifications();
            notice.showDateExams();
            //  student.addStudentInformation();
            int examsNumber = student.setExamsQuantity();
            int[] examsNotes = student.setQualificationsExams(examsNumber);
            int lowestQualification = student.getLowestQualification(examsNotes);
            int highestQualification = student.getHighestQualification(examsNotes);
            double sumOfQualifications = student.calculateSumOfQualifications(examsNotes);
            double totalAverageQualification = student.getExamsTotalAverageQualifications(sumOfQualifications, examsNumber);
            LOGGER.info("The lowest qualification is : " + lowestQualification);
            LOGGER.info("The highest qualification is : " + highestQualification);
            LOGGER.info("The total average qualification is : " + totalAverageQualification);

        } else if (category == 2) {
            //  teacher.addTeacherInformation();
            ICourse course = new CourseImpl();
          //  String[] subjects = course.addSubjectToCourse();
          //  course.printSubjects(subjects);
          //  String[] students = course.addStudentToCourse();
          //  course.printStudents(students);
            String[] workshops = course.createWorkshop();
            course.printWorkshop(workshops);
            LOGGER.info("Now let's calculate your salary");
            IEmployee employee = new EmployeeImpl();
            double netIncome = employee.gettingIncome();
            int workingYears = employee.gettingYearsOfWork();
            double percentage = employee.gettingPercentage(workingYears);
            double totalSalary = employee.calculateNetIncomeByWorkingYears(netIncome, percentage);
            System.out.println("Your total salary is " + totalSalary);

        } else if (category == 3) {
            EmployeeImpl employee = new EmployeeImpl();
            employee.addEmployeeInformation();
            employee.addEmployeeInformation();
            System.out.println("Now let's calculate your salary");
            double netIncome = employee.gettingIncome();
            int workingYears = employee.gettingYearsOfWork();
            double percentage = employee.gettingPercentage(workingYears);
            double totalSalary = employee.calculateNetIncomeByWorkingYears(netIncome, percentage);
            System.out.println("Your total salary is " + totalSalary);

        }
    }


}
