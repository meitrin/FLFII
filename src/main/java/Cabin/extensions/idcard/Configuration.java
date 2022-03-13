package Cabin.extensions.idcard;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public enum Configuration {;
    EncryptionType encryption;
    EncryptionProvider encryptionProvider;

    Configuration(EncryptionProvider encryptionProvider, EncryptionType encryptionType){
        this.encryptionProvider=encryptionProvider;
        this.encryption=encryptionType;
    }

    public String execute(String text,int exercise) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        if(exercise==0){return encryptionProvider.encrypt(text);}
        else{return encryptionProvider.decrypt(text);}

    };
}
