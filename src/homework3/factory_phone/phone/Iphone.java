package homework3.factory_phone.phone;

import homework3.factory_phone.component.Camera;
import homework3.factory_phone.component.Case;
import homework3.factory_phone.component.Cpu;

import java.util.Arrays;

public class Iphone extends Phone {
    public Iphone(Camera camera, Case casephone, Cpu cpu1, Cpu cpu2) {
        super(camera, casephone, new Cpu[]{cpu1, cpu2});
        Cpu[] cpuArray = {cpu1, cpu2};
        for (Cpu cpu : cpuArray) {
            if (cpu == null) {
                throw new RuntimeException("Не может быть телефон с процессором у которого наличие null ");
            }
        }
    }


    public void printInfoCpu() {

        System.out.printf("Инфо о процессорах : %s \n", Arrays.toString(cpuArray));
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "camera=" + camera +
                ", casephone=" + casephone +
                ", cpuArray=" + Arrays.toString(cpuArray) +
                '}';
    }
}
