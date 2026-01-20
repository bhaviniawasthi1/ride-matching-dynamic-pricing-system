package model;

public class Ride {
    public Rider rider;
    public Driver driver;
    public double price;
    public boolean completed;

    public Ride(Rider rider, Driver driver, double price) {
        this.rider = rider;
        this.driver = driver;
        this.price = price;
        this.completed = false;
    }

    public void completeRide() {
        this.completed = true;
        this.driver.available = true;
    }
}
