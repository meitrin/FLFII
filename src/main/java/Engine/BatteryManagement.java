package Engine;

public enum BatteryManagement {
    instance;

    private TwoTwoBox xTwoTwoBox;

    public void chargeThree(int p1, int p2, int p3) {
        xTwoTwoBox.charge();//Persons/Employees/load()
    }

    public void takeout(int amount){
        xTwoTwoBox.takeout(amount);
    }

    public void setTwoTwoBox(TwoTwoBox xTwoTwoBox){
        this.xTwoTwoBox = xTwoTwoBox;
    }
}
