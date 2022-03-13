package Cabin;

public class Button implements IBusDoorEntry {

    private LeftRightPosition position;
    private Cabin xCabin;

    public Button(LeftRightPosition position) {
        this.position = position;
    }

    @Override
    public void use(int i, boolean state) {
        xCabin.getxBusDoor()[i].setOpen(!state);
    }

    public void setCabin(Cabin xCabin) {
        this.xCabin = xCabin;
    }
}