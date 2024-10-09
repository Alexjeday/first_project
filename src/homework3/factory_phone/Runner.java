package homework3.factory_phone;

import homework3.factory_phone.component.Camera;
import homework3.factory_phone.component.Case;
import homework3.factory_phone.component.Cpu;
import homework3.factory_phone.phone.Iphone;

public class Runner {
    public static void main(String[] args) {
        Camera camera = new Camera(10);
        Cpu cpu = new Cpu(900);
        Cpu cpu2 = new Cpu(950);
        Case aCase = new Case(100, 100, 100);
        Iphone iphone = new Iphone(camera,aCase, cpu, cpu2);
        iphone.printInfoCpu();
    }
}
