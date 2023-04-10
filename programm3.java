import java.util.Scanner;
import java.util.Stack;

public class programm3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mytext = scan.next();
        if (validate(mytext)==true){
            System.out.println("ок");
        }
        else{System.out.println("не ок");}
    }
    private static boolean isInArray(char symbol, char[] array) {
        if (array == null)
            throw new IllegalArgumentException();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == symbol)
                return true;
        }
        return false;
    }
    
    private static int indexOf(char symbol, char[] array) {
        if (array == null)
            throw new IllegalArgumentException();
        
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == symbol)
                index = i;
        }
        return index;
    }
 
    public static boolean validate(String text) {
        if (text == null)
            throw new IllegalArgumentException();
 
        Stack<Character> stack = new Stack<Character>();
 
        char[] openBrackets = new char[]{'{', '[', '('};
        char[] closeBrackets = new char[]{'}', ']', ')'};
 
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (isInArray(symbol, openBrackets))
                stack.push(symbol);
            else {
                int index = indexOf(symbol, closeBrackets);
                if (index != -1) {
                    if (stack.empty())
                        return false;
                    if (stack.pop() != openBrackets[index])
                        return false;
                }
            }                    
        }
        return stack.empty();
    }

}