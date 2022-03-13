package Cabin;

import FLF.FLF;
import Tank.MixingPlant;
import Tank.MixingRatio;
import Turrets.RoofExtinguishingArm;
import Turrets.RotaryKnobRoofExtinguishingArm;

public class JoyStickRoof extends JoyStick {
    private int buttonState = 0;
    private boolean isActive = false;
    private FLF flf;
    private RoofExtinguishingArm xRoofExtinguishingArm;
    private MixingPlant xMixingPlant;
    private RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm;

    public void pushLeftPushButton() {
        if (isActive) {
            xRoofExtinguishingArm.setActivated(false);
            isActive = false;
            buttonState = 0;
        } else {
            xRoofExtinguishingArm.setActivated(true);
            xRoofExtinguishingArm.setExtended(true, xRoofExtinguishingArm);
            isActive = true;

        }
    }

    public void pushRightPushButton() {
        if (isActive) {
            switch (buttonState){
                case 0 -> buttonState = 1;
                case 1 -> buttonState = 2;
                case 2 -> buttonState = 3;
                case 3 -> buttonState = 0;
            }
        } else {
            //no function
        }
    }

    public void pushButton() throws Exception {
        if (isActive) {
            switch (buttonState) {
                case 0 -> xMixingPlant.mix(MixingRatio.ZEROPERCENT, xRotaryKnobRoofExtinguishingArm.getMode());
                case 1 -> xMixingPlant.mix(MixingRatio.THREEPERCENT, xRotaryKnobRoofExtinguishingArm.getMode());
                case 2 -> xMixingPlant.mix(MixingRatio.FIVEPERCENT, xRotaryKnobRoofExtinguishingArm.getMode());
                case 3 -> xMixingPlant.mix(MixingRatio.TENPERCENT, xRotaryKnobRoofExtinguishingArm.getMode());
            }
        }
    }

    public void setxRoofExtinguishingArm(RoofExtinguishingArm xRoofExtinguishingArm){
        this.xRoofExtinguishingArm = xRoofExtinguishingArm;
    }
    public void setxMixingPlant(MixingPlant xMixingPlant){
        this.xMixingPlant = xMixingPlant;
    }
    public void setFLF(FLF flf){
        this.flf = flf;
    }
    public void setxRotaryKnobRoofExtinguishingArm(RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm){
        this.xRotaryKnobRoofExtinguishingArm = xRotaryKnobRoofExtinguishingArm;
    }
    public int getButtonState(){
        return buttonState;
    }

}
