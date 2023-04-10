import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class programm1 {
    public static void main(String[] args) {   
    Deque<Integer> Mydeque = createArray();
    
    if (checkOn(Mydeque)==true) {
        System.out.println("палиндром");
    }
    else{
        System.out.println("не палиндром");
        }
    }
    public static Deque<Integer> createArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("кол-во чисел");
        int x = scan.nextInt();
        Deque<Integer> lst = new ArrayDeque<>(x);
        for (int j = 0; j < x; j++) {
            int number = scan.nextInt();
            lst.add(number);
        }
        return lst;
        }
    public static boolean checkOn(Deque<Integer> deque){
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            int first = deque.pollFirst();
            int last = deque.pollLast();
                if (first!=last) {
                    res = false;
                    break;
                }
            }
    return res;
    }

}