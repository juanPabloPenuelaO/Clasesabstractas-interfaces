package Interfaces;

public interface In1{
    final int a = 10;
    public void display();
}

class TestClass implements In1{
    public void display(){
        System.out.println("saludos a todos!");
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}
