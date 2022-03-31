package org.universityHierarchy.service;

import java.util.HashMap;

public interface ICelator {

    void takeAssistance();

    void addSubject();

    HashMap<String, Integer> studentsQualifications();
}
