// Program to sum 2 two dimensional arrays forming a matrix.

package IndustrialTrainingProjects;
import java.util.Scanner;

public class TwoDimensionalArraySum {
        public static void main(String[] args) {
            int rows = 2, columns = 2;
            int[][] arrayA = new int[rows][columns];
            int[][] arrayB = new int[rows][columns];
            int[][] arraySum = new int[rows][columns];

            Scanner sc=new Scanner(System.in);

            System.out.println("\nEnter the 1st array elements : ");
            for(int i=0; i<rows;i++) {            
                for(int j=0; j<columns;j++) {
                    arrayA[i][j]=sc.nextInt();
                }
            }

            System.out.print("\nMatrix of Array A : \n");
            for(int []x:arrayA) {
                for(int y:x){
                    System.out.print(y+"        ");
                }
            System.out.println();
            }

            System.out.println("\nEnter the 2nd array elements : ");
            for(int i=0; i<rows;i++) {            
                for(int j=0; j<columns;j++) {
                    arrayB[i][j]=sc.nextInt();
                }
            }

            System.out.print("\nMatrix of Array B : \n");
            for(int []x:arrayB) {
                for(int y:x){
                    System.out.print(y+"        ");
                }
            System.out.println();
            }
            
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arraySum[i][j] = arrayA[i][j] + arrayB[i][j];
                }
            }

            System.out.println("\nSum of the given matrices is : ");
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(arraySum[i][j] + "    ");
                }
                System.out.println();
            }
        }
}
