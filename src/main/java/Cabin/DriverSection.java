package Cabin;

import Persons.Driver;
import Turrets.FrontWaterCannon;

public class DriverSection {

    private Accelerator xAccelerator;
    private BrakePedal xBrakePedal;
    private JoyStickFront xJoyStickFront;
    private FrontWaterCannon xFrontWaterCannon;
    private Driver xDriver;

    public DriverSection(Accelerator xAccelerator, BrakePedal xBrakePedal, JoyStickFront xJoyStickFront, FrontWaterCannon xFrontWaterCannon) {
        this.xAccelerator = xAccelerator;
        this.xBrakePedal = xBrakePedal;
        this.xJoyStickFront = xJoyStickFront;
        this.xFrontWaterCannon = xFrontWaterCannon;
    }

    public JoyStickFront getxJoyStickFront() {
        return xJoyStickFront;
    }

    public FrontWaterCannon getxFrontWaterCannon() {
        return xFrontWaterCannon;
    }

    public Accelerator getxAccelerator() {
        return xAccelerator;
    }

    public BrakePedal getxBrakePedal() {
        return xBrakePedal;
    }

    public void setxDriver(Driver xDriver) {
        this.xDriver = xDriver;
    }

}
