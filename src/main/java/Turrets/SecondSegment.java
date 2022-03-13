package Turrets;

public class SecondSegment extends RoofExtinguishingArm {

    private SecondSeg lenght;
    private boolean horizontal = false;

    public SecondSegment(SecondSeg lenght) {
        this.lenght = lenght;
    }

    public void activateRoofExtinguishingArm() {
        horizontal = true;
    }

    public void deactivateRoofExtinguishingArm() {
        horizontal = false;
    }

}
