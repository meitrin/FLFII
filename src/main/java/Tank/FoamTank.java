package Tank;

public class FoamTank extends Tank {

    char[][][] capacity = new char[75][45][10];

    public void fill() {
        for (int i = 0; i < 75; i++) {
            for (int j = 0; j < 45; j++) {
                for (int h = 0; h < 10; h++) {
                    capacity[i][j][h] = 'f';    //'f' for Foam
                }
            }
        }
    }

    public char[] foam(int mode) {
        char[] foam = new char[mode];
        int counter = 0;
        for (int i = 74; i >= 0; i--) {
            for (int j = 44; j >= 0; j--) {
                for (int m = 9; m >= 0; m--) {
                    if (mode > 0) {
                        if (capacity[i][j][m] == 'f') {
                            capacity[i][j][m] = '0';
                            foam[counter] = 'f';
                            counter++;
                            mode--;
                        }
                    } else {
                        //FEHLER
                    }
                }
            }
        }
        return foam;
    }

    public boolean foamfull() {
        for (int i = 0; i < 75; i++) {
            for (int j = 0; j < 45; j++) {
                for (int h = 0; h < 10; h++) {
                    if (capacity[i][j][h] != 'f') {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int capacity(){
        int intcapacity = 0;
        for (int i = 0; i < 75; i++) {
            for (int j = 0; j < 45; j++) {
                for (int h = 0; h < 10; h++) {
                    if(capacity[i][j][h] == 'f'){
                        intcapacity++;
                    };
                }
            }
        }
        return intcapacity;
    }
}
