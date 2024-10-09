package homework3.factory_phone.phone;

import homework3.factory_phone.component.Camera;
import homework3.factory_phone.component.Case;
import homework3.factory_phone.component.Cpu;

public abstract  class Phone {
    protected Camera camera;
    protected Case casephone;
    protected Cpu[] cpuArray;

    public Phone(Camera camera, Case casephone, Cpu[] cpuArray) {
        this.camera = camera;
        this.casephone = casephone;
        this.cpuArray = cpuArray;
    }

    public void makePhoto() {
        camera.madePhoto();
    }
}
