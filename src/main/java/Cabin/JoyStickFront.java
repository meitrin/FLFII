package Cabin;

import FLF.FLF;
import Tank.MixingPlant;
import Tank.MixingRatio;
import Turrets.FrontWaterCannon;

public class JoyStickFront extends JoyStick {
    private int buttonState = 0;
    private boolean isActive = false;
    private FrontWaterCannon xFrontWaterCannon;
    private MixingPlant xMixingPlant;
    private FLF flf;

    public void pushLeftPushButton(){
        if (isActive){
            isActive = false;
            buttonState = 0;
            xFrontWaterCannon.setActivated(false);
            xFrontWaterCannon.setRotatio(0);
        }
        else {
            xFrontWaterCannon.setActivated(true);
            xFrontWaterCannon.setRotatio(90);
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
        if (isActive){
            switch (buttonState){
                case 0 -> xMixingPlant.mix(MixingRatio.ZEROPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                case 1 -> xMixingPlant.mix(MixingRatio.THREEPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                case 2 -> xMixingPlant.mix(MixingRatio.FIVEPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                case 3 -> xMixingPlant.mix(MixingRatio.TENPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
            }
        }
    }

    public void setxFrontWaterCannon(FrontWaterCannon xFrontWaterCannon){
        this.xFrontWaterCannon = xFrontWaterCannon;
    }
    public void setxMixingPlant(MixingPlant xMixingPlant){
        this.xMixingPlant = xMixingPlant;
    }
    public void setFLF(FLF flf){
        this.flf = flf;
    }
    public int getButtonState(){
        return buttonState;
    }

}
