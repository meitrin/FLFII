package Cabin.extensions.idcard;

public class ID_Card{
    private RFID_Chip rfid_chip;
    public ID_Card(String encrypted){
        this.rfid_chip = new RFID_Chip(encrypted);
    }

    public RFID_Chip getRfid_chip() {
        return rfid_chip;
    }
}
