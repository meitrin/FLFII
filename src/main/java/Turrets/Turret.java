package Turrets;

public abstract class Turret {

    boolean activated = false;

    public void leftRotatio(int newDegree) {
    }

    public void rightRotatio(int newDegree) {
    }

    public void spray(char[] spray) {
        for (int i = 0; i < spray.length; i++) {     //sprayarray leeren
            spray[i] = '0';
        }
    }

    public void setActivated(boolean activatedub) {
    }

}
