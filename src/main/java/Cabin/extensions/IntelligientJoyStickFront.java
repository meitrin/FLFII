package Cabin.extensions;

import Cabin.JoyStick;
import Tank.MixingPlant;
import Tank.MixingRatio;
import Turrets.FrontWaterCannon;

public class IntelligientJoyStickFront extends JoyStick {

    private int buttonState = 0;
    private boolean isActive = false;
    private FrontWaterCannon xFrontWaterCannon;
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
                    xFrontWaterCannon.setActivated(true);
                    xFrontWaterCannon.setRotatio(90);
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
                    xMixingPlant.mix(MixingRatio.ZEROPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                    isActive = false;
                }
                case 1 -> {
                    xMixingPlant.mix(MixingRatio.THREEPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                    isActive = false;
                }
                case 2 -> {
                    xMixingPlant.mix(MixingRatio.FIVEPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                    isActive = false;
                }
                case 3 -> {
                    xMixingPlant.mix(MixingRatio.TENPERCENT, xFrontWaterCannon.getxRotaryKnobFrontWaterCannon().getMode());
                    isActive = false;
                }
            }
        }
    }

    public void setxFrontWaterCannon(FrontWaterCannon xFrontWaterCannon){
        this.xFrontWaterCannon = xFrontWaterCannon;
    }
    public void setxMixingPlant(MixingPlant xMixingPlant){
        this.xMixingPlant = xMixingPlant;
    }
}
