package Midterm;

public class AbstractAndInterface {
    public static void main(String[] args) {
//        Midterm.Greeting g = new Midterm.Greeting();
//        g.sayHi();
//        g.sayHello();
//        Midterm.Moblie m = new Midterm.Moblie();
//        m.call();
//        m.Capture();
//        m.hangup();
//
//        Midterm.RichMobile richMobile = new Midterm.RichMobile();
//        richMobile.call();
//        richMobile.Capture();
//        richMobile.track();
//        richMobile.hangup();
    }
}

interface Gps{
    void track();
}

interface Camera{
    void Capture();
}
interface Phone{
    void call();
    void hangup();
}

class Moblie implements Phone,Camera {

    @Override
    public void Capture() {
        System.out.println("Mobile Capture");
    }

    @Override
    public void call() {
        System.out.println("Mobile Call");
    }

    @Override
    public void hangup() {
        System.out.println("Mobile hangup");
    }
}
abstract class Abstract {
    void sayHello(){
        System.out.println("Hello");
    }

    abstract void sayHi();

}

class Greeting extends Abstract {


    @Override
    void sayHi() {
        System.out.println("Hi");
    }
}

class RichMobile implements Gps , Camera , Phone {

    @Override
    public void track() {
        System.out.println("Rich Mobile Track");
    }

    @Override
    public void Capture() {
        System.out.println("Rich Mobile Capture");
    }

    @Override
    public void call() {
        System.out.println("Rich Mobile call");
    }

    @Override
    public void hangup() {
        System.out.println("Rich Mobile Hangup");
    }
}

class RichMibileByExtend extends Moblie implements Gps{

    @Override
    public void track() {
        System.out.println("Rich Mobile Track");
    }
}