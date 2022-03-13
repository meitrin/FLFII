package Lights;

import EventBus.BlueLightEvent;
import com.google.common.eventbus.Subscribe;

public class SmallLightBlue extends Lights {

    private final Led[] leds = new Led[]{new Led()};
    private LightPosition position;

    public SmallLightBlue(LightPosition position,int id) {
        super(id);
        this.position = position;
    }


    public LightPosition getPosition() {
        return position;
    }

    @Subscribe
    public void receive(BlueLightEvent event){
        setOn(isOn());
    }

}
