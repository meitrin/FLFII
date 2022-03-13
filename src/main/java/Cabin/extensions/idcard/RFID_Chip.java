package Cabin.extensions.idcard;

public class RFID_Chip{
    private String encrypted;

    public RFID_Chip(String encrypted) {
        this.encrypted = encrypted;
    }

    public String getEncrypted() {
        return encrypted;
    }
}
