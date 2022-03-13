package Turrets;

import Tank.MixingPlant;

public class FrontWaterCannon extends Turret {

    private MixingPlant xMixingPlant;
    private boolean activated;
    private int degree;
    private RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon;

    public void setxMixingPlant(MixingPlant xMixingPlant) {
        this.xMixingPlant = xMixingPlant;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activatedub) {
        this.activated = activatedub;
    }

    public void leftRotatio(int newDegree) {
        this.degree = 360 - newDegree;
    }

    public void rightRotatio(int newDegree) {
        this.degree = newDegree;
    }

    public void setRotatio(int newDegree) {
        this.degree = newDegree;
    }

    @Override
    public void spray(char[] spray) {
        super.spray(spray);
    }

    public void setxRotaryKnobFrontWaterCannon(RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon) {
        this.xRotaryKnobFrontWaterCannon = xRotaryKnobFrontWaterCannon;
    }

    public RotaryKnobFrontWaterCannon getxRotaryKnobFrontWaterCannon() {
        return xRotaryKnobFrontWaterCannon;
    }

}
