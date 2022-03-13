package Cabin.extensions.idcard;

public class Person{
    private String name;
    private ID_Card idcard;
    public Person(String name, String encrypted){
        this.name = name;
        this.idcard = new ID_Card(encrypted);
    }

    public ID_Card getIdcard() {
        return idcard;
    }
}
