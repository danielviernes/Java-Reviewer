package org.example.design_pattern.memento;

import org.example.design_patterns.memento.Location;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class MementoTest {

    @Test
    public void testMemento_success() {
        /*
          Scenario:
            Location 1 -> Location 2 -> Location 3 -> goBack()
          Expected:
            Location 2
         */

        Location testLocation = new Location("Location 1");
        System.out.println(testLocation.getLocationName());
        testLocation.moveLocation("Location 2");
        System.out.println(testLocation.getLocationName());
        testLocation.moveLocation("Location 3");
        System.out.println(testLocation.getLocationName());
        testLocation.goBack();
        System.out.println(testLocation.getLocationName());

        Assert.assertEquals("Location 2", testLocation.getLocationName());

    }

    @Test
    public void testNoPreviousLocation_throwsEmptyStackException() {
        Location testLocation = new Location("Location 1");
        System.out.println(testLocation.getLocationName());
        testLocation.moveLocation("Location 2");
        System.out.println(testLocation.getLocationName());
        testLocation.goBack();
        System.out.println(testLocation.getLocationName());

        Assert.assertThrows(EmptyStackException.class, testLocation::goBack);
    }

}
