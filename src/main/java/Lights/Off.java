package Lights;

public class Off implements  IState{
    @Override
    public void press(Switch aSwitch) {
        aSwitch.setState(new On());
    }
}
