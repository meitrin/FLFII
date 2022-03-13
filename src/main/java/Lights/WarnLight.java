package Lights;

import EventBus.WarningLightEvent;
import com.google.common.eventbus.Subscribe;

public class WarnLight extends Lights {

    private final Led[] leds = new Led[]{new Led()};
    private LightPosition position;

    public WarnLight(LightPosition position,int id){
        this.position = position;
    }

    public LightPosition getPosition() {
        return position;
    }

    @Subscribe
    public void receive(WarningLightEvent event){
        setOn(isOn());
    }

}
