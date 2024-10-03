package Lesson7.airport.ex2;

public class Duck implements Flyable{
    private boolean isMale;

    public Duck(boolean isMale) {
        this.isMale = isMale;
    }

    public void fly() {
        System.out.println("Утка летит!");
    }
}
