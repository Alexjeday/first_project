package homework4.ex4.predator;

import homework4.ex4.ActionForDeadAliveException;
import homework4.ex4.Alive;

public abstract class Predator extends Alive {


    public Predator(double weight) {
        super(weight);
    }

    /**
     * @param alive different alive creature
     */
    public void attack(Alive alive) {
        if (this.theDead) {
            throw new ActionForDeadAliveException("Животное мертвое и не может делать действие.");
        }
        if (canAttack(alive)) {
            this.dead();
        } else {
            alive.dead();
            this.weight = weight + getWeight() / 3;
        }


    }
    protected boolean canAttack(Alive alive) {
        return this.weight < alive.getWeight();
    }
}
