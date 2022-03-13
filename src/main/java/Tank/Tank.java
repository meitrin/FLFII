package Tank;

import FLF.Observer;

import java.util.ArrayList;

public abstract class Tank {
    protected char[][][] capacity;
    private ArrayList<Observer> observers;

    public char[] foam(int i) {
        return new char[0];
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

}
