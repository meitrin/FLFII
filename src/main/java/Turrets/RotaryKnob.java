package Turrets;

public class RotaryKnob implements IRotaryKnob {

    RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm;
    RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon;

    public RotaryKnob(RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon, RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm) {
        this.xRotaryKnobFrontWaterCannon = xRotaryKnobFrontWaterCannon;
        this.xRotaryKnobRoofExtinguishingArm = xRotaryKnobRoofExtinguishingArm;
    }

    public RotaryKnob() {
    }

    public RotaryKnobRoofExtinguishingArm getxRotaryKnobRoofExtinguishingArm() {

        return xRotaryKnobRoofExtinguishingArm;
    }

    public RotaryKnobFrontWaterCannon getxRotaryKnobFrontWaterCannon() {

        return xRotaryKnobFrontWaterCannon;
    }

    @Override
    public void rotateLeft() {
    }

    @Override
    public void rotateRight() {
    }

}
