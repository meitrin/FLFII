package Cabin.extensions.idcard;


import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class DESProvider implements EncryptionProvider{

    private KeyGenerator kg;
    private SecretKey myDESKey;

    public DESProvider() throws Exception {
        this.kg = KeyGenerator.getInstance("DES");
        this.myDESKey = kg.generateKey();
    }

    @Override
    public String encrypt(String text) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, myDESKey);
        byte[] textEnc = text.getBytes(StandardCharsets.UTF_8);
        textEnc = cipher.doFinal(textEnc);
        return new String(Base64.getEncoder().encode(textEnc));
    }

    @Override
    public String decrypt(String text) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, myDESKey);
        byte[] textDec = Base64.getDecoder().decode(text);
        textDec = cipher.doFinal(textDec);
        return new String(textDec);
    }
}
