package constructor_chaining;

public class A {
    private int a;
    private int b;

    A(){
        System.out.println("Cons A");
    }

    A(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Cons AA");
    }
}
