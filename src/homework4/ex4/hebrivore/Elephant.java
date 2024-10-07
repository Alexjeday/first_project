package homework4.ex4.hebrivore;

public class Elephant extends Herbivore {
    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() {
        checkCanRun();
        System.out.println("Слон бежит медленно!");
    }
}
