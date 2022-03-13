package Cabin.extensions.idcard;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class IDCard_management {
    private Person person;
    private KeyGenerator kg;
    private SecretKey myDESKey;
    public IDCard_management() {
        Centralunit cu = new Centralunit();
        person = new Person("Sam", cu.encryption("FT-DUS-FLF-5-Sam-6072"));
        person = new Person("Red Adair", cu.encryption("FT-DUS-FLF-5-Red Adair-6072"));
        try {
            this.kg = KeyGenerator.getInstance("DES");
            this.myDESKey = kg.generateKey();
        } catch (Exception e) {

        }
    }

    public Person getPerson() {
        return person;
    }
}
