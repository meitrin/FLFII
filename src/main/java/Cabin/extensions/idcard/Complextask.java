package Cabin.extensions.idcard;

import FLF.FLF;

public class Complextask {
    FLF flf = new FLF.Builder().build();
    Receiver_module rm = new Receiver_module();

    public void handleparking(){
        flf.getxCabin().getxBusDoor()[0].setOpen(true);
        flf.getxCabin().getxBusDoor()[1].setOpen(true);
        if(rm.holdupidcard("Sam")){
            flf.getxCabin().getxBusDoor()[0].setOpen(false);
            flf.getxCabin().getxBusDoor()[1].setOpen(false);
        }
    }

    public void controldrive(){
        if(rm.holdupidcard("Sam")){
            flf.getxCabin().getxBusDoor()[0].setOpen(true);
            flf.getxCabin().getxBusDoor()[1].setOpen(true);
        }
    }

    public void emergencydrive(){
        if(rm.holdupidcard("Sam")){
            flf.getxCabin().getxBusDoor()[0].setOpen(true);
            flf.getxCabin().getxBusDoor()[1].setOpen(true);
        }
    }
}