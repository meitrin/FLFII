package Persons;

import Engine.BatteryManagement;
import Tank.FoamTank;
import Tank.WaterTank;

public class Employees extends Person {

    private WaterTank xWaterTank;
    private FoamTank xFoamTank;

    public void service() {
        System.out.println("Fahrzeug wurde repaiert und ist voll funktionsfähig!");
    }

    public void load() {
        xWaterTank.fill();
        xFoamTank.fill();
        BatteryManagement.instance.charge();
    }

    public void setxFoamTank(FoamTank xFoamTank) {
        this.xFoamTank = xFoamTank;
    }

    public void setxWaterTank(WaterTank xWaterTank) {
        this.xWaterTank = xWaterTank;
    }


}
