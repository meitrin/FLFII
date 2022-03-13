package Turrets;

public class FirstSegment extends RoofExtinguishingArm {

    private static boolean extended;
    private static int degree = 0;

    public static void activateRoofExtinguishingArm() {
        degree = 90;
        extended = true;
    }

    public static void deactivateRoofExtinguishingArm() {
        degree = 0;
        extended = false;
    }
}
