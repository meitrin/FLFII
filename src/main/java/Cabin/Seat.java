package Cabin;

public class Seat {

    private Respirators xRespirators;
    LeftRightPosition position;
    private boolean isused = false;

    public Seat(LeftRightPosition position) {
        this.position = position;
    }

    public boolean isIsused() {
        return isused;
    }

    public void setxRespirators(Respirators xRespirators) {
        this.xRespirators = xRespirators;
    }

    public Respirators getxRespirator(){
        return xRespirators;
    }

    public void setIsused(boolean isused) {
        this.isused = isused;
    }


}
