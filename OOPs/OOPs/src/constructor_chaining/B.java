package constructor_chaining;

public class B extends A{
    private int c;

    B(int c)
    {
//        kayword for using another parameterised constructor
        super(8, 0);
        System.out.println("Cons B");
    }
}
