package overriding;

public class B extends A{

//    a method with same signature is not allowed
//    but if private of A, then cannot be accessed by B => then valid
    @Override
    void doSomething() {
        super.doSomething();
        System.out.println("B Here");
    }

}
