package org.universityHierarchy;

public class Neighborhood extends States{

    private String neighborhoodName;

    public Neighborhood() {
    }

    public Neighborhood(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }
}
