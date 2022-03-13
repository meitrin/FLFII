package Engine;

public class TwoTwoBox {

    private Battery[] xBattery;

    public int takeout(int amount) {
        amount = (int) (amount * 12.5);
        boolean found = false;
        int counter = 3;
        int getOutAmout = amount;
        if (amount != 0) {
            do{
                do{
                    if(xBattery[counter].mainCell[0].getState(0,0) == 0){
                        counter--;
                    }else found = true;
                }while(!found);
                amount = xBattery[counter].takeout(amount);
            }while(amount!=0);
        }
        if (amount == 0) {
            return amount;
        }
        return getOutAmout;
    }

    public void setxBattery(Battery[] xBattery) {
        this.xBattery = xBattery;
    }

    public void charge() {
        for (int i = 0; i < 4; i++) {
            xBattery[i].charge();
        }
    }

    public int capacity() {
        int capacity = 0;
        for (int n = 0; n < 4; n++) {
            for (int i = 99; i >= 0; i--) {
                for (int j = 9; j >= 0; j--) {
                    for (int m = 99; m >= 0; m--) {
                        if (xBattery[n].mainCell[i].getState(m,j) == 1) {
                            capacity++;
                        }
                    }
                }
            }
        }
        return capacity;
    }
}