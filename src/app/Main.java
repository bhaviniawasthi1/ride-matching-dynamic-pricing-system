package app;

import model.*;
import repository.*;
import service.*;

public class Main {

    public static void main(String[] args) {

        DriverRepository driverRepository = new DriverRepository();
        RideRepository rideRepository = new RideRepository();
        RideMatchingService matchingService = new RideMatchingService();
        PricingService pricingService = new PricingService();

        driverRepository.addDriver(
                new Driver(1, new Location(1, 1)));
        driverRepository.addDriver(
                new Driver(2, new Location(5, 5)));

        Rider rider =
                new Rider(101, new Location(2, 2));

        Driver driver = matchingService.findNearestDriver(
                rider,
                driverRepository.getAvailableDrivers()
        );

        double price = pricingService.calculatePrice(
                1,
                driverRepository.getAvailableDrivers().size()
        );

        driver.available = false;

        Ride ride = new Ride(rider, driver, price);
        rideRepository.addRide(ride);

        System.out.println("Ride Started");
        System.out.println("Rider ID: " + rider.id);
        System.out.println("Driver ID: " + driver.id);
        System.out.println("Price: ₹" + price);

        // Simulate ride completion
        ride.completeRide();

        System.out.println("Ride Completed");
        System.out.println("Driver available again: "
                + driver.available);
    }
}

