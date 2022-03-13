package Cabin.extensions.idcard;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Centralunit {
    private KeyGenerator kg;
    private SecretKey myDESKey;
    public Centralunit() {
        try {
            this.kg = KeyGenerator.getInstance("DES");
            this.myDESKey = kg.generateKey();
        } catch (Exception e) {
        }
    }

    public String encryption(String text){
        try{
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, myDESKey);
            byte[] textEnc = text.getBytes(StandardCharsets.UTF_8);
            textEnc = cipher.doFinal(textEnc);
            return new String(Base64.getEncoder().encode(textEnc));
        }
        catch(Exception e) {
            System.out.printf("ENC, %s%n", text);
            e.printStackTrace();
        }
        return null;
    }

    public String decryption(String text){
        try{
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, myDESKey);
            byte[] textDec = Base64.getDecoder().decode(text);
            textDec = cipher.doFinal(textDec);
            return new String(textDec);
        }
        catch(Exception e) {
            System.out.printf("DEC, %s%n", text);
            e.printStackTrace();
        }
        return null;
    }
}
