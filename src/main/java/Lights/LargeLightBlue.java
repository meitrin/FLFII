package Lights;

import EventBus.BlueLightEvent;
import com.google.common.eventbus.Subscribe;

public class LargeLightBlue extends Lights {

    private final Led[] leds = new Led[]{new Led(), new Led(), new Led(), new Led()};

    private LightPosition position;

    public LargeLightBlue(LightPosition position,int id) {
        this.position = position;
    }

    @Subscribe
    public void receive(BlueLightEvent event){
        setOn(isOn());
    }
}
