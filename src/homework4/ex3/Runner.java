package homework4.ex3;

public class Runner {
    public static void main(String[] args) {
        MakeSound bird = new Bird();
        MakeSound builder = new Builder();
        MakeSound driver = new Driver();
        MakeSound human = new Human();

        MakeSound[] makingSounds = {bird, builder, driver, human};
        for (MakeSound soundobject : makingSounds) {
            System.out.println(soundobject.makeSound());
        }
    }



}
