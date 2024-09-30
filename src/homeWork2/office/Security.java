package homeWork2.office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }
    public void giveMeHalfSalary(){
        System.out.println("Дайте мне аванс, быстро!");
    }
    public String getName() {
        return name;
    }
}
