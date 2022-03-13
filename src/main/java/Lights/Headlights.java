package Lights;

import EventBus.FrontLightEvent;
import EventBus.TopLightEvent;
import com.google.common.eventbus.Subscribe;

public class Headlights extends Lights {

    private LightPosition position;

    public Headlights(LightPosition position, int id) {
        super(id);
        this.position = position;
    }

    public LightPosition getPosition() {
        return position;
    }

    @Subscribe
    public void receive(FrontLightEvent event){
        if(!getPosition().equals(LightPosition.FRONT)){
            setOn(isOn());
        }
    }

    @Subscribe
    public void receive(TopLightEvent event){
        if(getPosition().equals(LightPosition.FRONT)){
            setOn(isOn());
        }
    }

}
