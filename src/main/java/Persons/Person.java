package Persons;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Person {

    private Employees xEmployees;
    private Driver xDriver;
    private Operator xOperator;

    public Person(Employees xEmployees, Driver xDriver, Operator xOperator) {
        this.xDriver = xDriver;
        this.xEmployees = xEmployees;
        this.xOperator = xOperator;
    }

    public Person() {
    }

    public Employees getxEmployees() {
        return xEmployees;
    }
}
