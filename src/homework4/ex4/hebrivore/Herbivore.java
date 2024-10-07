package homework4.ex4.hebrivore;

import homework4.ex4.ActionForDeadAliveException;
import homework4.ex4.Alive;

/**
 * Класс травоядные.
 */
public abstract class Herbivore extends Alive {
    public Herbivore(double weight) {
        super(weight);
    }
    protected void checkCanRun() {
        if (this.theDead) {
            throw new ActionForDeadAliveException("Животное не может бегать! ");
        }
    }

   public abstract void run();
}
