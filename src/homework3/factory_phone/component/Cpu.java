package homework3.factory_phone.component;

/**
 * CPU
 */
public class Cpu {
    private double mhz;

    public Cpu(double mhz) {
        this.mhz = mhz;
    }

    public double getMhz() {
        return mhz;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "mhz=" + mhz +
                '}';
    }
}
