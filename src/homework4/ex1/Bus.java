package homework4.ex1.car;

import homework4.ex1.car.Car;

public class Bus extends Car {
    private final int maxCountPassengers;

    public Bus(double length, double height, double width, int maxCountPassengers) {
        super(length, height, width);
        this.maxCountPassengers = maxCountPassengers;
    }

    public Bus(Boolean isClear, double length, double height, double width, int maxCountPassengers) {
        super(isClear, length, height, width);
        this.maxCountPassengers = maxCountPassengers;
    }

    public int getMaxCountPassengers() {
        return maxCountPassengers;
    }
}
