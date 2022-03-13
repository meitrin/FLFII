package Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Cell {
    protected Cell parentUnit;
    protected int state=0;
    protected List<Cell> cellList;

    public Cell(){
        this.cellList=new ArrayList<>();
    }

    public void addUnit(Cell cell){
        cellList.add(cell);
    }
    public final ListIterator<Cell> listCells() {
        return cellList.listIterator();
    }
    public void setState(int state){
        this.state=state;
    }
    public int getState(){
        return state;
    }

    public int getCell(){return state;}
}
