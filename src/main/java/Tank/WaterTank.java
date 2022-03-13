package Tank;

import FLF.ControlPanel;
import FLF.Observer;

import java.util.ArrayList;

public class WaterTank extends Tank {

    private ArrayList<Observer> waterList;
    private ControlPanel controlPanel;

    public WaterTank(){
        this.waterList=new ArrayList<>();
        addObserver(controlPanel.getWaterWatch());
    }


    public void addObserver(Observer observer){
        waterList.add(observer);
    }
    public void removeObserver(Observer observer){
        waterList.remove(observer);
    }
    public void update(){
        for(Observer observer : waterList){observer.update();}
    }

    char[][][] capacity = new char[75][45][30];


    public void fill() {
        for (int i = 0; i < 75; i++) {
            for (int j = 0; j < 45; j++) {
                for (int h = 0; h < 30; h++) {
                    capacity[i][j][h] = 'w';    //w for Water
                }
            }
        }
        update();
    }

    public char[] water(int mode) {
        char[] water = new char[mode];
        int counter = 0;
        for (int i = 74; i >= 0; i--) {
            for (int j = 44; j >= 0; j--) {
                for (int m = 29; m >= 0; m--) {
                    if (mode > 0) {
                        if (capacity[i][j][m] == 'w') {
                            capacity[i][j][m] = '0'; //0 steht für kein Wasser -> leer
                            water[counter] = 'w';
                            counter++;
                            mode--;
                        }
                    } else {
                        //FEHLER
                    }
                }
            }
        }
        update();
        return water;
    }

    public boolean waterfull() {
        for (int i = 0; i < 75; i++) {
            for (int j = 0; j < 45; j++) {
                for (int h = 0; h < 30; h++) {
                    if (capacity[i][j][h] != 'w') {
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
                for (int h = 0; h < 30; h++) {
                    if(capacity[i][j][h] == 'w'){
                        intcapacity++;
                    };
                }
            }
        }
        return intcapacity;
    }
}
