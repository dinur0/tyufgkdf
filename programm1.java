import java.util.HashMap;
import java.util.Scanner;

public class programm1 {
public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> phones = new HashMap<>();
    System.out.println("кол-во записей"); 
    int count = sc.nextInt();
    System.out.println("ФИО:номер телефона"); 
    for (int i = 0; i < count; i++) {
        String[] str = sc.next().split(":");
        if (phones.containsKey(str[0])) {
            phones.put(str[0], phones.get(str[0]) + "," + str[1]);
        } else {
            phones.put(str[0],str[1]);
        }
    }
    System.out.print(phones);
    }
}
