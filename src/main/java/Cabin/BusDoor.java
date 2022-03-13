package Cabin;

public class BusDoor {
    private boolean isOpen;
    private IBusDoorEntry entry;
    private Button xButton;
    private LeftRightPosition side;

    public BusDoor(LeftRightPosition position) {
        this.side = position;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setxButton(Button xButton) {
        this.xButton = xButton;
    }

    public Button getxButton() {
        return xButton;
    }
}
