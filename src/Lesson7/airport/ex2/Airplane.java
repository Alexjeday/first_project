package Lesson7.airport.ex2;

public class Airplane implements Flyable {
    private int enginePower;

    public Airplane(int enginePower) {
        this.enginePower = enginePower;
    }

    /**
     *
     */
    //@Override
    public void fly() {
        if (enginePower > 100) {
            System.out.println("Самолет полетит!");
        }

    }
    
    @Override
    public void land() {
        System.out.println("Airplane is landed");
    }
}
