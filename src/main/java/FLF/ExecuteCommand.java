package FLF;

import Lights.SwitchType;

public class ExecuteCommand implements SwitchCommand{
    private CentralUnit centralUnit;

    public ExecuteCommand(CentralUnit centralUnit){this.centralUnit=centralUnit;}

    @Override
    public void command(SwitchType switchType) throws Exception {
        centralUnit.execute(switchType);
    }
}
