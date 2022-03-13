package Engine;

public class Battery {

    MainCell[] mainCell;

    public Battery(){
        this.mainCell=new MainCell[100];
    }


    //int[][][] capacity = new int[100][10][100];

    public int takeout(int amount) {
        for (int i = 99; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                for (int m = 99; m >= 0; m--) {
                    if (amount > 0) {
                        if (mainCell[i].getState(m,j) == 1) {
                            mainCell[i].setState(m,j,0); //0 steht für kein Elektron vorhanden -> nicht geladen
                            amount--;
                        }
                    } else {
                        return amount;
                    }
                }
            }
        }
        return amount;
    }

    public void charge() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                for (int m = 0; m < 100; m++) {
                    mainCell[i].setState(m,j,1); //1 steht für Elektron vorhanden -> geladen
                }
            }
        }
    }

    public boolean batteryfull() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                for (int m = 0; m < 100; m++) {
                    if (mainCell[i].getState(m,j) != 1) {
                        return false; //1 steht für Elektron vorhanden -> geladen
                    }
                }
            }
        }
        return true;
    }
}
