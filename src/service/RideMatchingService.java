package service;

import model.Driver;
import model.Rider;
import java.util.List;

public class RideMatchingService {

    public Driver findNearestDriver(Rider rider, List<Driver> drivers) {
        Driver nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            double distance =
                    driver.location.distanceTo(rider.pickupLocation);

            if (distance < minDistance) {
                minDistance = distance;
                nearest = driver;
            }
        }
        return nearest;
    }
}
