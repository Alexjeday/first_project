package homework4.ex4;

public abstract class Alive {
    protected boolean theDead; // dead or not
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTheDead(boolean theDead) {
        this.theDead = theDead;
    }

    public void dead() {
        this.theDead = true;
    }

}
