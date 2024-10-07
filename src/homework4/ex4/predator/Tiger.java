package homework4.ex4.predator;

import homework4.ex4.Alive;

public class Tiger extends Predator {
    public Tiger(double weight) {
        super(weight);
    }

    @Override
    protected boolean canAttack(Alive alive) {
        return this.weight * 2 < alive.getWeight();
    }


}
