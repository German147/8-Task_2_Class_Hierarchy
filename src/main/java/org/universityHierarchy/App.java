package org.universityHierarchy;

/**
 * Hello world!
 */
public class App {
    private String name;
    private String location;

    public static void main(String[] args) {

        UserInteractionClass user1 = new UserInteractionClass();
        String name = user1.greeting();
        user1.setName(name);
        user1.welcomeUser(name);
        int category = user1.chooseCategoryUser();
        user1.chosenCategory(category);
        user1.addStudentInformation(category);
        user1.addTeacherInformation(category);
        user1.addEmployeeInformation(category);



    }
}
/*Your GPA, or Grade Point Average, is a number
that indicates how well or how high you scored in
 your courses on average. It's meant to score you
  (usually on a GPA scale between 1.0 and 4.0) during your studies
  and shows whether your overall grades have been high or low.*/