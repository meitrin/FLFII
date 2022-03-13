package Cabin.extensions.idcard;

import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class RSAProvider implements EncryptionProvider{

    private KeyPairGenerator generator;
    private KeyPair pair;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    public RSAProvider() throws NoSuchAlgorithmException {
        this.generator=KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        this.pair= generator.generateKeyPair();
        this.privateKey=pair.getPrivate();
        this.publicKey=pair.getPublic();
    }

    @Override
    public String encrypt(String text) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher= Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        byte[] textByte=text.getBytes(StandardCharsets.UTF_8);
        byte[] cryptByte=cipher.doFinal(textByte);
        return Base64.getEncoder().encodeToString(cryptByte);
    }

    @Override
    public String decrypt(String text) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] textByte=text.getBytes(StandardCharsets.UTF_8);
        byte[] decryptByte = cipher.doFinal(textByte);
        return new String(decryptByte, StandardCharsets.UTF_8);
    }
}
