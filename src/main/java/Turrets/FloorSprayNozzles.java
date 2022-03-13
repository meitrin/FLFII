package Turrets;

import EventBus.SelfProtectionEvent;
import EventBus.Subscriber;
import FLF.CentralUnit;
import FLF.FLF;
import Tank.WaterTank;
import com.google.common.eventbus.Subscribe;

import java.lang.reflect.InvocationTargetException;

public class FloorSprayNozzles extends Subscriber {

    boolean activated = false;
    private WaterTank pWaterTank;
    private FLF flf;

    public FloorSprayNozzles(int id, FLF flf) {
        super(id);
        this.flf=flf;
    }

    public void setpWaterTank(WaterTank pWaterTank) {
        this.pWaterTank = pWaterTank;
    }

    public void sprayWater(char[] water) {
        this.activated = true;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }

    @Subscribe
    public void receive(SelfProtectionEvent event) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        if(isActivated()){
            setActivated(false);
        }
        else{
            setActivated(true);
            sprayWater(flf.getxMixingPlant().getWater());
        }
    }

}
