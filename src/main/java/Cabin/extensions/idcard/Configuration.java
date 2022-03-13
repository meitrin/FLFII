package Cabin.extensions.idcard;


public enum Configuration {;
    private EncryptionProvider encryptionProvider;


    public String execute(String text,int exercise,EncryptionType encryptionType) throws Exception {
        if(encryptionType==EncryptionType.AES){
            if(this.encryptionProvider==null){
                this.encryptionProvider=new AESProvider();
            }
            if(exercise==0){return encryptionProvider.encrypt(text);}
            else{return encryptionProvider.decrypt(text);}
        }
        if(encryptionType==EncryptionType.RSA){
            if(this.encryptionProvider==null){this.encryptionProvider=new RSAProvider();}
            if(exercise==0){return encryptionProvider.encrypt(text);}
            else{return encryptionProvider.decrypt(text);}
        }
        else {
            if(this.encryptionProvider==null){this.encryptionProvider=new DESProvider();}
            if(exercise==0){return encryptionProvider.encrypt(text);}
            else{return encryptionProvider.decrypt(text);}
        }
    };
}
