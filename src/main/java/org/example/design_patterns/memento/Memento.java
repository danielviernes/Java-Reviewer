package org.example.design_patterns.memento;

public class Memento {

    private final String locationName;

    public Memento(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return this.locationName;
    }

}
