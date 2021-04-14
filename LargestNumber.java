//  Program to find out the largest number (Dynamic Method).

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value in this is: " + max);
    }
}
