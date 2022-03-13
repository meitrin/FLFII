package Engine;

public class OneToThreeAdapter implements OnePort {

    BatteryManagement batteryManagement;

    @Override
    public void chargeOne(int amount) {
        int charge1=300;
        int charge2=300;
        int charge3=400;
        if((amount-charge1-charge2-charge3)==0){
            batteryManagement.chargeThree(charge1,charge2,charge3);
        }
        else{System.out.println("Zu wenig Input");}


    }
}
