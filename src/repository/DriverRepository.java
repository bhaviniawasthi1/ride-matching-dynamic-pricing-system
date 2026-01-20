package repository;

import model.Driver;
import java.util.ArrayList;
import java.util.List;

public class DriverRepository {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Driver> getAvailableDrivers() {
        List<Driver> available = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.available) {
                available.add(driver);
            }
        }
        return available;
    }
}
