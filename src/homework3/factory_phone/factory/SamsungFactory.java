package homework3.factory_phone.factory;

import homework3.factory_phone.component.Camera;
import homework3.factory_phone.component.Case;
import homework3.factory_phone.component.Cpu;
import homework3.factory_phone.phone.SamsungPhone;

public class SamsungFactory {

   private static final int   COUNT_MEGAPIXELS = 16;
    private static final int   CPU_MGZ = 1500;
    private static final int   CASE_WIDTH = 60;
    private static final int   CASE_HIGHT = 200;
    private static final int   CASE_LENGTH = 15;
    public static SamsungPhone createPhone() {
        //Умеет создавать и заполнять его процессором (1500 Mhz), 16 мегапиксельной камерой,
        // и корпусом 60х200х15


        Camera camera = new Camera(COUNT_MEGAPIXELS);
        Cpu cpu = new Cpu(CPU_MGZ);
        Case aCase = new Case(CASE_WIDTH, CASE_LENGTH, CASE_HIGHT);
        return new SamsungPhone(camera, aCase, cpu);
    }
}
