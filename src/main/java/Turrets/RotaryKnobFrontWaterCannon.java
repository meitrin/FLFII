package Turrets;

public class RotaryKnobFrontWaterCannon extends RotaryKnob {

    private Mode mode = Mode.c500;

    @Override
    public void rotateLeft() {
        switch (mode){
            case c500 -> mode = Mode.c3500;
            case c1000 -> mode = Mode.c500;
            case c1500 -> mode = Mode.c1000;
            case c2000 -> mode = Mode.c1500;
            case c2500 -> mode = Mode.c2000;
            case c3000 -> mode = Mode.c2500;
            case c3500 -> mode = Mode.c3000;
        }
    }

    @Override
    public void rotateRight() {
        switch (mode){
            case c500 -> mode = Mode.c1000;
            case c1000 -> mode = Mode.c1500;
            case c1500 -> mode = Mode.c2000;
            case c2000 -> mode = Mode.c2500;
            case c2500 -> mode = Mode.c3000;
            case c3000 -> mode = Mode.c3500;
            case c3500 -> mode = Mode.c500;
        }
    }

    public Mode getMode() {
        return mode;
    }

}
