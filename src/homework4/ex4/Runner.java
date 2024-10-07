package homework4.ex4;

import homework4.ex4.hebrivore.Elephant;
import homework4.ex4.hebrivore.Rabbit;
import homework4.ex4.predator.Tiger;
import homework4.ex4.predator.Wolf;

public class Runner {
    private static Object trycatch;

    public static void main(String[] args) {
        Tiger tiger = new Tiger(300);
        Elephant elephant = new Elephant(1000);
        Rabbit rabbit = new Rabbit(2);
        Wolf wolf = new Wolf(50);

        rabbit.run();
        wolf.attack(rabbit);
        tiger.attack(wolf);
        tiger.attack(elephant);
        elephant.run();
        try {
            rabbit.run();
        } catch (ActionForDeadAliveException e) {
            System.out.println(e.getMessage());
        }

    }

}
