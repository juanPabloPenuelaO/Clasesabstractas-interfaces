package ClasesAbstractas;

abstract class Base {
    Base(){
        System.out.println("Base constructor called");
    }
    abstract void fun();
}

class Derived extends Base2 {
    Derived(){
        System.out.println("Derived constructor called");
    }
    void fun(){
        System.out.println("Derived fun() called");
    }
}

class GFG {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.fun();
    }
}




