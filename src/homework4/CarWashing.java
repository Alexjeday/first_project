package homework4;

import homework4.ex1.car.Car;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

/**
 * Помывка машины
 */
public class CarWashing {
    private final static double BIG_CAR_LENGTH = 6;
    private final static double BIG_CAR_HEIGHT = 2.5;
    private final static double BIG_CAR_WIDTH = 2;


    public BigDecimal wash(Car car) {
        car.setClear(true);
        //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
        if (car.getHeight() > BIG_CAR_HEIGHT || car.getLength() > BIG_CAR_LENGTH
                || car.getWidth() > BIG_CAR_WIDTH) {
            return TarifWash.BIG_PRICE.getPrice();

        }
        return TarifWash.SMALL_PRICE.getPrice();
    }
    public BigDecimal wash(Car... cars) {
            BigDecimal totalResult = ZERO;
            for (Car car: cars) {
                totalResult = totalResult.add(wash(car));
            }
            return totalResult;
    }

}
