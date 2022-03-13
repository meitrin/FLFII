package Cabin.extensions;

import Cabin.JoyStick;
import Tank.MixingPlant;
import Tank.MixingRatio;
import Turrets.RoofExtinguishingArm;

public class IntelligientJoyStickRoof extends JoyStick {

    private int buttonState = 0;
    private boolean isActive = false;
    private RoofExtinguishingArm xRoofExtinguishingArm;
    private MixingPlant xMixingPlant;

    public void pushButton(int taps) {
        switch (taps){
            case 1 -> {
                if (isActive) {
                    switch(buttonState){
                        case 0 -> buttonState = 1;
                        case 1 -> buttonState = 2;
                        case 2 -> buttonState = 3;
                        case 3 -> {
                            buttonState = 0;
                            isActive = false;
                        }
                    }
                }
            }
            case 2 -> {
                if (!isActive){
                    isActive = true;
                    buttonState = 0;
                    xRoofExtinguishingArm.setActivated(true);
                    xRoofExtinguishingArm.setExtended(true, xRoofExtinguishingArm);
                }
            }
        }
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

    public void pushSwitch() throws Exception {
        if (isActive){
            switch (buttonState){
                case 0 -> {
                    xMixingPlant.mix(MixingRatio.ZEROPERCENT, xRoofExtinguishingArm.getxRotaryKnobRoofExtinguishingArm().getMode());
                    isActive = false;
                }
                case 1 -> {
                    xMixingPlant.mix(MixingRatio.THREEPERCENT, xRoofExtinguishingArm.getxRotaryKnobRoofExtinguishingArm().getMode());
                    isActive = false;
                }
                case 2 -> {
                    xMixingPlant.mix(MixingRatio.FIVEPERCENT, xRoofExtinguishingArm.getxRotaryKnobRoofExtinguishingArm().getMode());
                    isActive = false;
                }
                case 3 -> {
                    xMixingPlant.mix(MixingRatio.TENPERCENT, xRoofExtinguishingArm.getxRotaryKnobRoofExtinguishingArm().getMode());
                    isActive = false;
                }
            }
        }
    }

    public void setxRoofExtinguishingArm(RoofExtinguishingArm xRoofExtinguishingArm){
        this.xRoofExtinguishingArm = xRoofExtinguishingArm;
    }
    public void setxMixingPlant(MixingPlant xMixingPlant){
        this.xMixingPlant = xMixingPlant;
    }


}
