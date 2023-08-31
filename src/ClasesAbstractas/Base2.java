package ClasesAbstractas;

abstract class Base2 {
    public void fun2(){
        System.out.println("Function of Base class is called");
    }
}
class Derived2 extends Base2 {

}

class Main{
    public static void main(String[] args) {
    }
    Derived2 d = new Derived2();
    d.fun2();
}
