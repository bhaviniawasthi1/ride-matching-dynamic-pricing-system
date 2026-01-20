package model;

public class Driver {
    public int id;
    public Location location;
    public boolean available;

    public Driver(int id, Location location) {
        this.id = id;
        this.location = location;
        this.available = true;
    }
}
