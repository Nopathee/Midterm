package exam.unit;

import exam.base.Orgunit;

public class School extends Orgunit {


    private double balance;

    public School(int code, String name) {
        super(code , name);
    }


    public double getBalance() {
        return balance;
    }

    public void earn(double amount) {
        balance += amount;
        logging += "earn(" + amount + ")";
    }

    public void spend(double amount) {
        balance -= amount;
        logging += "spend(" + amount + ")";
    }


}
