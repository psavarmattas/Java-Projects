// Program to find out the number entered is Even/Odd (Static Method).

public class EvenOdd {
    public static void main(String[] args) {
        int num= 25;
        System.out.println("You enter number: " + num);
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
