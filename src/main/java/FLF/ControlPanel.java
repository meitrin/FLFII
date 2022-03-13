package FLF;

import Cabin.LeftRightPosition;
import Lights.Switch;
import Lights.SwitchType;

public class ControlPanel {
    private Switch[] xSwitch;
    private CentralUnit xCentralUnit;
    private SwitchCommand switchCommand;

    public ControlPanel(Switch[] xSwitch) {
        this.xSwitch = xSwitch;
    }

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

    public void pressSwitchIndicator(LeftRightPosition position) {
        xCentralUnit.pressSwitchIndicator(position);
    }
}
