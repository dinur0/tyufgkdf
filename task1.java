import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        newfloat();
    }

    public static void newfloat(){
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        try {
            float a = sc.nextFloat();
            System.out.println("Ответ: "+a);
        } catch (InputMismatchException e) {
            System.err.println("Значение должно быть форматом float!");
            newfloat();
        }
    }

}
