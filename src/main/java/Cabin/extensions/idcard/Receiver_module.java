package Cabin.extensions.idcard;

public class Receiver_module {
    IDCard_management im;
    Centralunit cu;
    public boolean holdupidcard(String name){
        if(name.equals("Sam")){
            Person person = im.getPerson();
            String text = person.getIdcard().getRfid_chip().getEncrypted();
            text = cu.decryption(text);
            if(text.equals("FT-DUS-FLF-5-Sam-6072")) return true;
            else return false;
        }
        if(name.equals("Red Adair")){
            Person person = im.getPerson();
            String text = person.getIdcard().getRfid_chip().getEncrypted();
            text = cu.decryption(text);
            if(text.equals("FT-DUS-FLF-5-Sam-6072")) return true;
            else return false;
        }
        return false;
    }
}
