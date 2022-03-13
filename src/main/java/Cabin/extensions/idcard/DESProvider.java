package Cabin.extensions.idcard;


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DESProvider implements EncryptionProvider{

    Cipher ecipher;
    Cipher dcipher;
    SecretKey key;

    public DESProvider() throws Exception{
        this.dcipher=Cipher.getInstance("DES");
        this.ecipher=Cipher.getInstance("DES");
        this.key= KeyGenerator.getInstance("DES").generateKey();
        ecipher.init(Cipher.ENCRYPT_MODE,key);
        dcipher.init(Cipher.DECRYPT_MODE,key);
    }

    @Override
    public String encrypt(String text) throws Exception{
        byte[] utf8 = text.getBytes("UTF8");
        byte[] enc = ecipher.doFinal(utf8);
        enc= BASE64EncoderStream.encode(enc);

        return text;
    }

    @Override
    public String decrypt(String text) {

        return text;
    }
}
