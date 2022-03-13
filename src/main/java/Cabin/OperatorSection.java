package Cabin;

import FLF.ControlPanel;
import Persons.Operator;
import Turrets.RoofExtinguishingArm;
import Turrets.RotaryKnobFrontWaterCannon;
import Turrets.RotaryKnobRoofExtinguishingArm;

public class OperatorSection {

    private JoyStickRoof xJoyStickRoof;
    private ControlPanel xControlPanel;
    private RoofExtinguishingArm xRoofExtinguishingArm;
    private Operator xOperator;
    private RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon;
    private RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm;

    public OperatorSection(JoyStickRoof xJoyStickRoof, ControlPanel xControlPanel, RoofExtinguishingArm xRoofExtinguishingArm) {
        this.xControlPanel = xControlPanel;
        this.xJoyStickRoof = xJoyStickRoof;
        this.xRoofExtinguishingArm = xRoofExtinguishingArm;
    }


    public ControlPanel getxControlPanel() {
        return xControlPanel;
    }

    public JoyStickRoof getxJoyStickRoof() {
        return xJoyStickRoof;
    }

    public RoofExtinguishingArm getxRoofExtinguishingArm() {
        return xRoofExtinguishingArm;
    }

    public void setxOperator(Operator xOperator) {
        this.xOperator = xOperator;
    }

    public RotaryKnobFrontWaterCannon getxRotaryKnobFrontWaterCannon() {
        return xRotaryKnobFrontWaterCannon;
    }

    public RotaryKnobRoofExtinguishingArm getxRotaryKnobRoofExtinguishingArm() {
        return xRotaryKnobRoofExtinguishingArm;
    }

    public void setxRotaryKnobFrontWaterCannon(RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon) {
        this.xRotaryKnobFrontWaterCannon = xRotaryKnobFrontWaterCannon;
    }

    public void setxRotaryKnobRoofExtinguishingArm(RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm) {
        this.xRotaryKnobRoofExtinguishingArm = xRotaryKnobRoofExtinguishingArm;
    }

}
