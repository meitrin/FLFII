package Cabin;

import FLF.CentralUnit;

public class Accelerator extends Pedal {

    private CentralUnit xCentralUnit;

    public void press() {
        for (int i = 0; i < 2; i++) {
            xCentralUnit.getxFLF().getxElectricEngine()[i].rotate(4);
        }
        xCentralUnit.getxCabin().getxSpeedometer().reduceSpeed(4);
        xCentralUnit.getxCabin().getxResidualQuantitiesDisplay().updateDisplay(xCentralUnit.getxCabin().getxSpeedometer().getSpeed());
    }

    public void constant() {
        for (int i = 0; i < 2; i++) {
            xCentralUnit.getxFLF().getxElectricEngine()[i].rotateConstant();
            xCentralUnit.getxCabin().getxResidualQuantitiesDisplay().updateDisplay(xCentralUnit.getxCabin().getxSpeedometer().getSpeed());
        }
    }

    public void setxCentralUnit(CentralUnit xCentralUnit) {
        this.xCentralUnit = xCentralUnit;
    }

}
