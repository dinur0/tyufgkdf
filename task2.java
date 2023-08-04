import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {9}; // I add this line
            int d = 0;
            double catchedRes1 = intArray[0] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         /* 
         I add this
         */
         catch (ArrayIndexOutOfBoundsException e){
            System.err.println("out of index");
         }
         
    }
}
