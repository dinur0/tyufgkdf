
import java.io.EOFException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws Exception {
        // newvar();
        System.out.println("Введите значение");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a == "") {
            throw new Exception ("Значение null");
        }
    }

}
