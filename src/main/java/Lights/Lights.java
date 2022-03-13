package Lights;

import EventBus.Subscriber;

public abstract class Lights extends Subscriber {

    private LightPosition position;
    private boolean isOn;

    public Lights(int id) {
        super(id);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

}
