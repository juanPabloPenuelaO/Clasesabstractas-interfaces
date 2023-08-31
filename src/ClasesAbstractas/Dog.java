package ClasesAbstractas;

abstract class Animal {
    public abstract void sound();
}

public class Dog extends Animal{
    public void sound(){
        System.out.println("woof");
    }

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
