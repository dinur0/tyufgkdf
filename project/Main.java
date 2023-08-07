import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidERROR, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные:");
        String[] str = sc.nextLine().split(" ");
        addHuman(str);
    }
        private static void addHuman(String[] strHuman) throws InvalidERROR, IOException{

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Введите данные:");
        // // String temp = sc.nextLine();
        // String[] strHuman = sc.nextLine().split(" ");
        try {
            Human newhuman = new Human(strHuman[0], strHuman[1], strHuman[2],strHuman[3], Integer.parseInt(strHuman[4]), strHuman[5].charAt(0));
            // Human newhuman = new Human(this.surname, this.name, this.middle_name, this.date_of_birth, this.phone, this.gender);
        } catch (NullPointerException e) {
            throw new Exception("У человека должны быть 6 параметров");
        } catch (InvalidERROR e){
            throw e.getMessage();
        }
        // Human newhuman = new Human(strHuman[0], strHuman[1], strHuman[2],strHuman[3], Integer.parseInt(strHuman[4]), strHuman[5].charAt(0));
        try (FileWriter writer = new FileWriter(new File(strHuman[0] + ".txt"), true)) {
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Ресурс закрыт!");
        }
    }
}
