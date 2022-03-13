package Turrets;

import Tank.MixingPlant;

public class RoofExtinguishingArm extends Turret {

    private boolean extended = false;

    private MixingPlant xMixingPlant;
    private SecondSegment[] xSecondSegment;
    private FirstSegment xFirstSegment;
    private RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm;

    public RoofExtinguishingArm() {
    }

    public RoofExtinguishingArm(SecondSegment[] xSecondSegment, FirstSegment xFirstSegment) {
        this.xSecondSegment = xSecondSegment;
        this.xFirstSegment = xFirstSegment;
    }

    public void setxMixingPlant(MixingPlant xMixingPlant) {
        this.xMixingPlant = xMixingPlant;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended, RoofExtinguishingArm roofExtinguishingArm) {
        if (extended) {
            FirstSegment.activateRoofExtinguishingArm();
            for (int i = 0; i < 3; i++) {
                xSecondSegment[i].activateRoofExtinguishingArm();
            }
        } else {
            FirstSegment.deactivateRoofExtinguishingArm();
            for (int i = 0; i < 3; i++) {
                xSecondSegment[i].deactivateRoofExtinguishingArm();
            }
        }

        this.extended = extended;
    }

    @Override
    public void spray(char[] spray) {
        super.spray(spray);
    }

    public void setActivated(boolean activatedub) {
        this.activated = activatedub;

    }

    public RotaryKnobRoofExtinguishingArm getxRotaryKnobRoofExtinguishingArm() {
        return xRotaryKnobRoofExtinguishingArm;
    }

    public void setxRotaryKnobRoofExtinguishingArm(RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm) {
        this.xRotaryKnobRoofExtinguishingArm = xRotaryKnobRoofExtinguishingArm;
    }

}
