package homework3.factory_phone.component;

public class Camera {
    private double countMegaPixels;

    public Camera(double countMegaPixels) {
        this.countMegaPixels = countMegaPixels;
    }

    public double getCountMegaPixels() {
        return countMegaPixels;
    }

    public void madePhoto() {
        System.out.println("I can make photo. ");
    }
}
