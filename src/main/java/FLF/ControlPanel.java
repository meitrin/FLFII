package FLF;

import Cabin.LeftRightPosition;
import Lights.Switch;
import Lights.SwitchType;
import Tank.FoamTank;
import Tank.WaterTank;

public class ControlPanel {
    private Switch[] xSwitch;
    private CentralUnit xCentralUnit;
    private SwitchCommand switchCommand;
    private TankFuelLED waterWatch;
    private TankFuelLED foamWatch;

    public ControlPanel(Switch[] xSwitch, CentralUnit centralUnit, WaterTank waterTank, FoamTank foamTank) {
        this.xSwitch = xSwitch;
        this.xCentralUnit=centralUnit;
        this.waterWatch=new TankFuelLED("water", waterTank,foamTank);
        this.foamWatch=new TankFuelLED("foam", waterTank,foamTank);
    }

    public LEDColor getWater(){return waterWatch.getLedColor();}
    public LEDColor getFoam(){return foamWatch.getLedColor();}

    public void pressSwitch(SwitchType switchtype) throws Exception{
        for (int i = 0; i < 7; i++) {
            if (xSwitch[i].getSwitchType().equals(switchtype)) {
                switchCommand.command(switchtype);
                xSwitch[i].press(switchtype);
            }
        }
    }

    public void setxCentralUnit(CentralUnit xCentralUnit) {
        this.xCentralUnit = xCentralUnit;
    }

    public boolean isSwitchOn(SwitchType switchType) {
        for (int i = 0; i < 7; i++) {
            if (xSwitch[i].getSwitchType().equals(switchType)) {
                return xSwitch[i].isOn();
            }
        }
        return false;
    }
    public TankFuelLED getWaterWatch(){return waterWatch;}
    public TankFuelLED getFoamWatch(){return foamWatch;}

    public void pressSwitchIndicator(LeftRightPosition position) {
        xCentralUnit.pressSwitchIndicator(position);
    }
}