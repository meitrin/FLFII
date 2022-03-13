package Turrets;

public class RotaryKnobRoofExtinguishingArm extends RotaryKnob {

    private Mode mode = Mode.A;

    @Override
    public void rotateLeft() {
        switch (mode){
            case A -> mode = Mode.C;
            case B -> mode = Mode.A;
            case C -> mode = Mode.B;
        }
    }

    @Override
    public void rotateRight() {
        switch (mode){
            case A -> mode = Mode.B;
            case B -> mode = Mode.C;
            case C -> mode = Mode.A;
        }
    }

    public Mode getMode() {
        return mode;
    }

}
