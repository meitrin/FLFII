package Engine;

public class ChargingStation implements OnePort {

    private OneToThreeAdapter oneToThreeAdapter=new OneToThreeAdapter();
    public void chargeOne(int amount){
        oneToThreeAdapter.chargeOne(amount);
    }
}
