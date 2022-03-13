package Lights;

public class DirectionsIndicator extends Lights {

    private LightPosition position;

    public DirectionsIndicator(LightPosition position) {
        this.position = position;
    }

    public LightPosition getPosition() {
        return position;
    }
}
