import java.util.ArrayList;
import java.util.TreeMap;
public class programm2 {
    public static void main(String[] args) {   
        String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};
        TreeMap<String, String> Hashnames = new TreeMap<>(); 
        for (String exp : names) {
            String [] temp = exp.split(" ");
            if (Hashnames.containsKey(temp[1])) {
                Hashnames.put(temp[1], Hashnames.get(temp[1]) + "," + temp[0]);
            } else {
                Hashnames.put(temp[1],temp[0]);
            }
        }
        ArrayList<String> hachName = new ArrayList<>(Hashnames.values());
        TreeMap<String, Integer> res = new TreeMap<>();

        for (String j : hachName) {
            if (res.containsKey(j)) {
                res.put(j, res.get(j)+1);
            } else {
                res.put(j,1);
            }
        }
        ArrayList<String> sorNames = new ArrayList<>(res.keySet());
        for (String i : sorNames) {
            if(res.get(i)==1){
                res.remove(i);
            }
        }
        System.out.print(res);
}
}