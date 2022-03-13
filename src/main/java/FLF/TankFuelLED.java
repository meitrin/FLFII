package FLF;

import Tank.Tank;
import Tank.FoamTank;
import Tank.WaterTank;

public class TankFuelLED implements Observer{

    private LEDColor ledColor;
    private WaterTank waterTank;
    private FoamTank foamTank;

    public TankFuelLED(String tank, CentralUnit centralUnit){
        ledColor=LEDColor.NOT;
        if(tank.equals("water")){waterTank= centralUnit.getxFLF().getxWaterTank();}
        if(tank.equals("foam")){foamTank=centralUnit.getxFLF().getxFoamTank();}
    }

    @Override
    public void update() {
        int capacity;
        if(foamTank==null){
            capacity=waterTank.capacity();
            if(capacity<=50625){ledColor=LEDColor.YELLOW;}
            if(capacity<=25313){ledColor=LEDColor.ORANGE;}
            if(capacity<=10125){ledColor=LEDColor.RED;}
            else {ledColor=LEDColor.NOT;}
        }
        else{
            capacity= foamTank.capacity();
            if(capacity<=16875){ledColor=LEDColor.YELLOW;}
            if(capacity<=8438){ledColor=LEDColor.ORANGE;}
            if(capacity<=3375){ledColor=LEDColor.RED;}
            else {ledColor=LEDColor.NOT;}
        }
    }

    public LEDColor getLedColor(){return ledColor;}
}
