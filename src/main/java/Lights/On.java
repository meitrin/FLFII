package Lights;

public class On implements IState{
    @Override
    public void press(Switch aSwitch) {
        aSwitch.setState(new Off());
    }
}
