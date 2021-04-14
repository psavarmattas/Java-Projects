// Program to find out whether the number is  Prime or Not (Dynamic Method);

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num, i = 2;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        boolean flag = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}