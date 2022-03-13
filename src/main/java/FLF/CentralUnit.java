package FLF;

import Cabin.*;
import Lights.LightPosition;
import Lights.Switch;
import Lights.SwitchType;
import Tank.MixingPlant;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import com.google.common.eventbus.EventBus;
import EventBus.*;

public class CentralUnit {
    private SteeringWheel xSteeringWheel;
    private Accelerator xAccelerator;
    private BrakePedal xBrakePedal;
    private ControlPanel xControlPanel;
    private FLF flf;
    private Cabin xCabin;
    private EventBus eventBus;

    public CentralUnit(SteeringWheel xSteeringWheel, Accelerator xAccelerator, BrakePedal xBrakePedal, ControlPanel xControlPanel) {
        this.xSteeringWheel = xSteeringWheel;
        this.xAccelerator = xAccelerator;
        this.xBrakePedal = xBrakePedal;
        this.xControlPanel = xControlPanel;
        this.eventBus = new EventBus("cu");
        this.addSubscriber(flf.getxElectricEngine()[0]);
        this.addSubscriber(flf.getxElectricEngine()[1]);
        this.addSubscriber(flf.getxWarnLight()[0]);
        this.addSubscriber(flf.getxWarnLight()[1]);
        this.addSubscriber(flf.getxSmallLightBlue()[0]);
        this.addSubscriber(flf.getxSmallLightBlue()[1]);
        for(int i=0;i<4;i++){this.addSubscriber(flf.getxMidLightBlue()[i]);}
        for(int i=0;i<4;i++){this.addSubscriber(flf.getxLargeLightBlue()[i]);}
        for(int i=0;i<10;i++){this.addSubscriber(flf.getxHeadlights()[i]);}
        for(int i=0;i<10;i++){this.addSubscriber(flf.getxSideLight()[i]);}
        for(int i=0;i<7;i++){this.addSubscriber(flf.getxFloorSprayNozzles()[i]);}
    }

    public void addSubscriber(Subscriber subscriber){eventBus.register(subscriber);};

    public void execute(SwitchType switchType) throws Exception {
        switch (switchType) {
            case ENGINE:
                this.eventBus.post(new EngineEvent());
                /*for (int i = 0; i < 2; i++) {
                    if (flf.getxElectricEngine()[i].isStarted()) {
                        flf.getxElectricEngine()[i].shutdown();
                    } else flf.getxElectricEngine()[i].start();
                }*/
                break;
            case WARNLIGHT:
                this.eventBus.post(new WarningLightEvent());
                /*for (int i = 0; i < 2; i++) {
                    flf.getxWarnLight()[i].setOn(!flf.getxWarnLight()[i].isOn());
                }*/
                break;
            case BLUELIGHT:
                this.eventBus.post(new BlueLightEvent());
                /*for (int i = 0; i < 2; i++) {
                    flf.getxSmallLightBlue()[i].setOn(!flf.getxSmallLightBlue()[i].isOn());
                }
                for (int i = 0; i < 4; i++) {
                    flf.getxMidLightBlue()[i].setOn(!flf.getxMidLightBlue()[i].isOn());
                }
                for (int i = 0; i < 4; i++) {
                    flf.getxLargeLightBlue()[i].setOn(!flf.getxLargeLightBlue()[i].isOn());
                }*/
                break;
            case HEADLIGHT:
                this.eventBus.post(new FrontLightEvent());
                /*for (int i = 0; i < 10; i++) {
                    if (!flf.getxHeadlights()[i].getPosition().equals(LightPosition.FRONT)) {
                        flf.getxHeadlights()[i].setOn(!flf.getxHeadlights()[i].isOn());
                    }
                }*/
                break;
            case ROOFLIGHT:
                this.eventBus.post(new TopLightEvent());
                /*
                for (int i = 0; i < 10; i++) {
                    if (flf.getxHeadlights()[i].getPosition().equals(LightPosition.FRONT)) {
                        flf.getxHeadlights()[i].setOn(!flf.getxHeadlights()[i].isOn());
                    }
                }*/
                break;
            case SIDELIGHT:     //neue klasse mit sidelights (5 pro seite)
                this.eventBus.post(new SideLightEvent());
                /*for (int i = 0; i < 10; i++) {
                    flf.getxSideLight()[i].setOn(!flf.getxSideLight()[i].isOn());
                }*/
                break;
            default:    //FloorSprayNozzles
                this.eventBus.post(new SelfProtectionEvent());
                /*if (flf.getxFloorSprayNozzles()[0].isActivated()) {
                    for (int i = 0; i < 7; i++) {
                        flf.getxFloorSprayNozzles()[i].setActivated(false);
                    }
                } else
                    for (int i = 0; i < 7; i++) {
                        flf.getxFloorSprayNozzles()[i].setActivated(true);
                        flf.getxFloorSprayNozzles()[i].sprayWater(flf.getxMixingPlant().getWater());
                    }*/
        }
    }

    public void pressSwitchIndicator(LeftRightPosition position) {
        for (int i = 0; i < 4; i++) flf.getxDirectionsIndicator()[i].setOn(false);
        if (position.equals(LeftRightPosition.LEFT)) {
            for (int i = 0; i < 4; i++) {
                if (flf.getxDirectionsIndicator()[i].getPosition().equals(LightPosition.SIDEFRONTLEFT) || flf.getxDirectionsIndicator()[i].getPosition().equals(LightPosition.SIDEBACKLEFT)) {
                    flf.getxDirectionsIndicator()[i].setOn(true);
                }
            }
        }
        if (position.equals(LeftRightPosition.RIGHT)) {
            for (int i = 0; i < 4; i++) {
                if (flf.getxDirectionsIndicator()[i].getPosition().equals(LightPosition.SIDEFRONTRIGHT) || flf.getxDirectionsIndicator()[i].getPosition().equals(LightPosition.SIDEBACKRIGHT)) {
                    flf.getxDirectionsIndicator()[i].setOn(true);
                }
            }
        }
    }

    public ControlPanel getxControlPanel() {
        return xControlPanel;
    }

    public void setxFLF(FLF flf) {
        this.flf = flf;
    }

    public void setxCabin(Cabin xCabin) {
        this.xCabin = xCabin;
    }

    public Cabin getxCabin() {
        return xCabin;
    }

    public FLF getxFLF() {
        return flf;
    }
}
