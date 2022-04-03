package service;

import java.util.Set;

public interface ISubject {

    int SUBJECTS_LENGTH = 3;

  /// String[] addSubjectToCourse();

    Set<String> createSubjects();

    void printSubjects(Set<String> subjects);

    void printSubjects(String subjects[]);


}
