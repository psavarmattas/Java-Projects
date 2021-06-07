// Write a program in java to demonstrate chain constructor.

public class ChainConstructor {
    int a, b;
    public ChainConstructor( ) {
        this(3);
        System.out.println("Default");
    }
    public ChainConstructor (int x) {
        this(x, 2);
        System.out.println("with one arg");
    }
    public ChainConstructor(int x, int y) {
        a=x;
        b=y;
        System.out.println("with two args");
    }
    public static void main(String arg[]) {
        ChainConstructor p=new ChainConstructor( );
        ChainConstructor q=new ChainConstructor(8);
        ChainConstructor r = new ChainConstructor(8,7);
    }
}
