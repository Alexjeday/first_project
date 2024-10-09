package homework3.factory_phone.component;

public class Case {
    private int width;
    private int length;
    private  int hight;

    public Case(int width, int length, int hight) {
        this.width = width;
        this.length = length;
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHight() {
        return hight;
    }
}
