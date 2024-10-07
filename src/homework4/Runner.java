package homework4;

import homework4.ex1.car.Bus;
import homework4.ex1.car.Car;
import homework4.ex1.car.LightCar;


public class Runner {
    public static void main(String[] args) {
        int countLightCars = 4;
        int countBusCars = 5;
        Car[] cars = new Car[countLightCars + countBusCars];

        for(int i = 0; i < countLightCars; i++) {
            cars[i] = new LightCar(2, 2.5, 1.8,false);
        }

        for(int i = countLightCars; i < countLightCars + countBusCars; i++) {
            cars[i] = new Bus(3, 12, 2.3, 50);
        }
    CarWashing carwashing = new CarWashing();
        System.out.println(carwashing.wash(cars));
    }

}
