package Lights;

import EventBus.SideLightEvent;
import com.google.common.eventbus.Subscribe;

public class SideLight extends Lights {

    private LightPosition position;

    public SideLight(LightPosition position,int id) {
        this.position = position;
    }

    public LightPosition getPosition() {
        return position;
    }

    @Subscribe
    public void receive(SideLightEvent event){
        setOn(isOn());
    }

}
