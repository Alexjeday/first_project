package homework4.ex2;

public class Runner {
    public static void main(String[] args) {


        Duck duck = new Duck(false);
        Duck duckinjured = new Duck(true);
        Airplane airplane = new Airplane(10);
        Airplane airplanenotfly = new Airplane(-2);

        for (Flyable flyable : new Flyable[]{duck, duckinjured, airplanenotfly, airplane})
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
                ;
            }

    }
}
