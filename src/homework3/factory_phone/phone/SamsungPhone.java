package homework3.factory_phone.phone;

import homework3.factory_phone.component.Camera;
import homework3.factory_phone.component.Case;
import homework3.factory_phone.component.Cpu;

import java.util.Arrays;

public class SamsungPhone extends Phone{

    public SamsungPhone(Camera camera, Case casephone, Cpu cpu) {
        super(camera, casephone, new Cpu[]{cpu} );

    }

    @Override
    public String toString() {
        return "SamsungPhone{" +
                "camera=" + camera +
                ", casephone=" + casephone +
                ", cpuArray=" + Arrays.toString(cpuArray) +
                '}';
    }
}
