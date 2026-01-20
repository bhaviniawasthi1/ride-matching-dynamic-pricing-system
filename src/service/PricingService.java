package service;

public class PricingService {

    private static final double BASE_FARE = 50.0;

    public double calculatePrice(int activeRiders, int availableDrivers) {
        if (availableDrivers == 0) {
            return BASE_FARE * 2;
        }

        double surgeFactor =
                (double) activeRiders / availableDrivers;

        return BASE_FARE * Math.max(1.0, surgeFactor);
    }
}
