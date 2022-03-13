package Cabin.extensions.idcard;

public class Centralunit {

private Configuration configuration;


    public String encryption(String text){
        try{
            configuration.execute(text,0,EncryptionType.DES);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String decryption(String text){
        try{
            configuration.execute(text,1,EncryptionType.DES);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}