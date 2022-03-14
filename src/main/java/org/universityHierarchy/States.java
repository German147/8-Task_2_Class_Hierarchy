package org.universityHierarchy;

public class States extends Country{

    private String stateName;

    public States() {
    }

    public States(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + stateName + '\'' +
                '}';
    }
}
