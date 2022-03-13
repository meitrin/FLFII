package Engine;

public class SubCell extends Cell{

    private Cell[] cell;

    public SubCell(){
        this.cell=new Cell[10];
        for(int i=0;i<10;i++){
            cellList.add(cell[i]);
        }
    }
    public void setState(int field,int state){
         cell[field].setState(state);
    }
    public int getState(int field){
        return cell[field].getState();
    }
}
