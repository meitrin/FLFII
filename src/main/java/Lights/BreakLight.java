package Lights;

public class BreakLight extends Lights {

    private LightPosition position;

    public BreakLight(LightPosition position) {
        this.position = position;
    }

    public LightPosition getPosition() {
        return position;
    }

}
