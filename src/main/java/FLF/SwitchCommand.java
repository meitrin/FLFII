package FLF;

import Lights.SwitchType;

public interface SwitchCommand {
    public void command(SwitchType switchType) throws Exception;
}
