package Pivots;

public class PivotDynamic extends Pivot {

    private Tire[] xTire;
    private int angle;

    public void setxTire(Tire[] xTire) {
        this.xTire = xTire;
    }

    public PivotDynamic() {

    }

    public void turn(int angle){
        this.angle = angle;
    }

}
