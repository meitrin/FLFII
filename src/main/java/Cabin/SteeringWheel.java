package Cabin;

import FLF.CentralUnit;

public class SteeringWheel implements IStreeringWheel {

    private CentralUnit xCentralUnit;
    private int angle = 0;

    @Override
    public void turn(int addAngle) {
        this.angle = this.angle + addAngle;
        xCentralUnit.getxCabin().getxCentralUnit().getxFLF().getxPivotDynamic().turn(this.angle);
        if (addAngle != 0) {
            if (addAngle > 0) {
                xCentralUnit.getxControlPanel().pressSwitchIndicator(LeftRightPosition.LEFT);
            }
            if (addAngle < 0) {
                xCentralUnit.getxControlPanel().pressSwitchIndicator(LeftRightPosition.RIGHT);

            }
        } else {
            xCentralUnit.getxControlPanel().pressSwitchIndicator(LeftRightPosition.MID);
        }
    }

    public int getAngle() {
        return angle;
    }

    public void setxCentralUnit(CentralUnit xCentralUnit) {
        this.xCentralUnit = xCentralUnit;
    }

}
