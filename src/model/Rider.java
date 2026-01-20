package model;

public class Rider {
    public int id;
    public Location pickupLocation;

    public Rider(int id, Location pickupLocation) {
        this.id = id;
        this.pickupLocation = pickupLocation;
    }
}
