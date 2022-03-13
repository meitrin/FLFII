package Cabin;

import FLF.CentralUnit;

public class BrakePedal extends Pedal {

    private CentralUnit xCentralUnit;

    public void setxCentralUnit(CentralUnit xCentralUnit) {
        this.xCentralUnit = xCentralUnit;
    }

    public void press() {
            xCentralUnit.getxCabin().getxSpeedometer().reduceSpeed(-4);
            for (int i = 0; i < 2; i++) {
                xCentralUnit.getxFLF().getxElectricEngine()[i].rotate(-4);
            }
    }

}
