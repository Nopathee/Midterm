package Midterm;

public class NestedClass {
    public static void main(String[] args) {
//        Outer.Inner inner = new Outer.Inner();
//        inner.sayHello();

        Animal animal = new Animal();
        animal.sound();

        //annoymous

        Animal giant = new Animal(){
            @Override
            public void sound(){
                System.out.println("Flush");
            }
        };
        giant.sound();
    }
}

class Animal {
    public void sound(){
        System.out.println("Meaow Meaow");
    }
}

class Outer {
    static class Inner {
        public void sayHello(){
            System.out.println("Hello World");
        }
    }
}
