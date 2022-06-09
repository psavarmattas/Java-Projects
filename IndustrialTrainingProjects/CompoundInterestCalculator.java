// Program to calculate compound interest for the provided principle amount & time by following certain criteria.
// You are builing an interest calculation. Following are the rules:
// 1. If deposit = 1yr : Interest = 5%
// 2. If deposit = Greater than 1 yr and less than 3yr : Interest = 5.5%
// 3. If deposit = Greater than 3 yr : Interest = 6%
// Input from user for Principle Amount & Tenture (time period).
// Output Principle + Interest.

package IndustrialTrainingProjects;

import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String[] args){
        //Declare and initialize the variables 
        float p , r=0 , t  , n = 1; 

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("\nEnter a Principle number : ");
        p = inputScanner.nextInt();

        System.out.print("\nEnter a Time period in years : ");
        t = inputScanner.nextInt();

        // checks if time is less than 1 yr
        if (t <= 1) {
            r = 5;
        }
    
        // checks if time is greater than 1 yr and time is less than 3 yr
        else if ((t > 1) && (t <= 3)) {
            r = (float) 5.5;
        }
        
        // if both condition is false
        else {
            r = 6;
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