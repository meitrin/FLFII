package Lights;


public class Switch {

    private SwitchType switchType;
    boolean isOn = false;
    private IState state=new Off();

    public Switch(SwitchType switchType) {
        this.switchType = switchType;
    }

    public boolean isOn() {
        return isOn;
    }

    public void press(SwitchType switchtype) {
        state.press(getSwitch());
        if(getState().equals(new On())){isOn=true;}
        if(getState().equals(new Off())){isOn=false;}
    }

    public SwitchType getSwitchType() {
        return switchType;
    }

    public IState getState(){return state;}
    public void setState(IState state){this.state = state;}
    public Switch getSwitch(){return this;}
}
