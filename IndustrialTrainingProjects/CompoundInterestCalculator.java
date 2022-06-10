// Program to calculate compound interest for the provided principle amount & time by following certain criteria.
// You are builing an interest calculation. Following are the rules:
// 1. If deposit = 1yr : Interest = 5%
// 2. If deposit = Greater than 1 yr and less than 3yr : Interest = 5.5%
// 3. If deposit = Greater than 3 yr and less than 5yr : Interest = 6%
// 4. If deposit = Greater than 5 yr : Interest = 6.5%
// 5. If age = Less than 18 : + 1%
// 6. If age = Less than 60 : + 1.5%
// Input from user for Principle Amount & Tenture (time period).
// Output Principle + Interest.

package IndustrialTrainingProjects;

import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String[] args){
        //Declare and initialize the variables 
        float p , r=0 , t  , n = 1; 
        int age = 0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("\nEnter a Principle number : ");
        p = inputScanner.nextInt();

        System.out.print("\nEnter a Time period in years : ");
        t = inputScanner.nextInt();

        System.out.print("\nEnter your age in years : ");
        age = inputScanner.nextInt();

        // checks if time is less than 1 yr
        if (t <= 1) {
            r = 5;
        }
    
        // checks if time is greater than 1 yr and time is less than 3 yr
        else if ((t > 1) && (t <= 3)) {
            r = (float) 5.5;
        }

        // checks if time is greater than 3 yr and time is less than 5 yr
        else if ((t > 3) && (t <= 5)) {
            r = 6;
        }

        // checks if time is greater than 5 yr
        else if (t > 5) {
            r = (float) 6.5;
        }

        // checks if age is less than 18 yr
        if (age <= 18) {
            r = r + 1 ;
        }

        // checks if age is greater than 18 yr and is less than 60 yr
        else if ((age > 18) && (age <= 60)) {
            r = (float) (r + 1.5);
        }

        // Input error check
        else {
            System.out.println("Error Wrong Age Input!");
        }

        //Print the variables and their corresponding values
        System.out.println("\nThe entered principle amount is = " + p);
        System.out.println("\nThe entered time period is " + t);
        System.out.println("\nThe rate of interest is = " + r);
        System.out.println("\nThe number of times the interest is compounded is " + n);
        findCi(p,r,t,n);
    }

    private static void findCi(float p, float r, float t, float n) {
        //Calculate the compound interest and the amount
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("\nCompound Interest after " + t + " years: " + cinterest);
        System.out.println("\nAmount after " + t + " years: " + amount);
    }
}