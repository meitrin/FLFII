package Engine;

public enum BatteryManagement {
    instance;

    private TwoTwoBox xTwoTwoBox;

    public void charge() {
        xTwoTwoBox.charge();
    }

    public void takeout(int amount){
        xTwoTwoBox.takeout(amount);
    }

    public void setTwoTwoBox(TwoTwoBox xTwoTwoBox){
        this.xTwoTwoBox = xTwoTwoBox;
    }
}
