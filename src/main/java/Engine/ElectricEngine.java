package Engine;

import EventBus.EngineEvent;
import EventBus.Subscriber;
import com.google.common.eventbus.Subscribe;

public class ElectricEngine extends Subscriber {
    private int kmh;
    boolean isStarted = false;

    public ElectricEngine(int id) {
        super(id);
    }

    public void start() {
        isStarted = true;
    }

    public void rotate(int addKmh) {
        this.kmh = this.kmh + addKmh;
        BatteryManagement.instance.takeout(this.kmh);

    }

    public void rotateConstant() {
        BatteryManagement.instance.takeout(this.kmh);
    }

    public void shutdown() {
        isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }

    @Subscribe
    public void receive(EngineEvent event){
        if (isStarted()) {
            shutdown();
        } else start();

    }

}
