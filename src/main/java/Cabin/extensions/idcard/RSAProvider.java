package Cabin.extensions.idcard;

public class RSAProvider implements EncryptionProvider{
    @Override
    public String encrypt(String text) {
        return text;
    }

    @Override
    public String decrypt(String text) {
        return text;
    }
}
