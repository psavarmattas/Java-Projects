// Program to demonstrate input from keyboard using Scanner.

import java.util.Scanner;


public class InputFromKeyBoard {
    public static void main(String [] args) {
        int n;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of names you want to store: ");  
        n=sc.nextInt();  
        String[] array = new String[n];  
        System.out.println("Enter the names: ");  
        for(int i=0; i<n; i++) {    
            array[i]=sc.next();  
        }  
        System.out.println("The names are: ");  
        for (String s : array) {  
            System.out.println(s);  
        }  
    }
}