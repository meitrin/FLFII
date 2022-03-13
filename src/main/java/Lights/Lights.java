package Lights;

import EventBus.Subscriber;

public abstract class Lights extends Subscriber {

    private LightPosition position;
    private boolean isOn;

    public Lights(){
        super(1);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}