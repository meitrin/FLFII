package Engine;

public class MainCell extends Cell{

    private SubCell[] subCell;

    public MainCell(){
        this.subCell=new SubCell[100];
        for (int i=0;i<100;i++){
            cellList.add(subCell[i]);
        }
    }
    public void setState(int subField,int field,int state){
         subCell[subField].setState(field,state);
    }
    public int getState(int subField,int field){
        return subCell[subField].getState(field);
    }
}
