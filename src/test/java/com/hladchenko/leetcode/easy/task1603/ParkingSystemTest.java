package com.hladchenko.leetcode.easy.task1603;

import org.junit.Assert;
import org.junit.Test;

public class ParkingSystemTest {

    @Test
    public void createParkingSystemInstanceAndAddCars() {
        //given
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

        //when
        boolean addResult1 = parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
        boolean addResult2 = parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
        boolean addResult3 = parkingSystem.addCar(3); // return false because there is no available slot for a small car
        boolean addResult4 = parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.

        //then
        Assert.assertTrue(addResult1);
        Assert.assertTrue(addResult2);
        Assert.assertFalse(addResult3);
        Assert.assertFalse(addResult4);
    }
}
