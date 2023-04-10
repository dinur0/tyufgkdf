import java.util.ArrayDeque;
// import java.util.Arrays;
import java.util.Deque;
// import java.util.LinkedList;
import java.util.Scanner;

public class programm2 {

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = createArray();
    Deque<Integer> d2 = createArray();
    // Deque<Integer> Llist = new ArrayDeque<Integer>();
    // String str1 = new String();
    // String str2 = new String();
    // int length1 = deque1.size();
    // int length2 = deque2.size();
    // for (int index = 0; index < length1; index++) {
    // str1 += deque1.pollLast();
    // }
    // for (int i = 0; i < length2; i++) {
    // str2 += deque2.pollLast();
    // }
    // int summ = Integer.parseInt(str1) + Integer.parseInt(str2);
    // while (summ > 0 ) {
    // Llist.add(summ%10);
    // summ = summ/10;
    // }
    System.out.println(sum(d1,d2));
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

public static Deque<Integer> sum(Deque<Integer> deque1, Deque<Integer> deque2) {
    Deque<Integer> Llist = new ArrayDeque<Integer>();
    String str1 = new String();
    String str2 = new String();
    int length1 = deque1.size();
    int length2 = deque2.size();
    for (int index = 0; index < length1; index++) {
    str1 += deque1.pollLast();
    }
    for (int i = 0; i < length2; i++) {
    str2 += deque2.pollLast();
    }
    int summ = Integer.parseInt(str1) + Integer.parseInt(str2);
    while (summ > 0 ) {
    Llist.add(summ%10);
    summ = summ/10;
    }
    return Llist;
}
}