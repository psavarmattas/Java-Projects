// Write a Java program to accept a number and check the number is even or not. 
// Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class OddEvenNumberOutput {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an Integer:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("1 - Even");
        }
        else {
            System.out.println("0 - Odd");
        }
    }
}
