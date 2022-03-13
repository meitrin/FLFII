package Cabin;

public class Speedometer {

    private int speed = 0;

    public void reduceSpeed(int speed) {
        this.speed = this.speed + speed;
    }

    public int getSpeed() {
        return speed;
    }

}
