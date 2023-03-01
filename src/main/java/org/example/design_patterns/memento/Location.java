package org.example.design_patterns.memento;

import java.util.EmptyStackException;

public class Location {

    private String locationName;
    private final Caretaker caretaker = new Caretaker();

    public Location(String startingLocation) {
        this.locationName = startingLocation;
    }

    public void moveLocation(String newLocationName) {
        caretaker.save(saveLocation(this.locationName));
        this.locationName = newLocationName;
    }

    public void goBack() throws EmptyStackException {
        Memento lastMemento = caretaker.undo();
        this.locationName = lastMemento.getLocationName();
    }

    public Memento saveLocation(String locationName) {
        return new Memento(locationName);
    }

    public String getLocationName() {
        return this.locationName;
    }

}
