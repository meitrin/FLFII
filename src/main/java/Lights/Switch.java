package Lights;


public class Switch {

    private SwitchType switchType;
    boolean isOn = false;

    public Switch(SwitchType switchType) {
        this.switchType = switchType;
    }

    public boolean isOn() {
        return isOn;
    }

    public void press(SwitchType switchtype) {
        isOn = !isOn;
    }

    public SwitchType getSwitchType() {
        return switchType;
    }

}
