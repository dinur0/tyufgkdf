import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PC {
    Scanner sc = new Scanner(System.in);
    public String name;
    public String color;
    public String CPU;
    public int RAM;
    public int memory; 
    
    public PC(String name, String color, String CPU,int RAM,int memory){
        this.name = name;
        this.color = color;
        this.CPU = CPU;
        this.RAM = RAM;
        this.memory = memory;
    }
public int getMemory(){
    return memory;
}
public String getName(){
    return name;
}
public int getRAM(){
    return RAM;
}
public String getcolor(){
    return color;
}
public List<PC> filter(List<PC> notebooks){
    System.out.println("Введите цифру, соответствующую необходимому критерию: \n 1: название \n 2: цвет \n 3: ОЗУ \n 4: память");
    int choice = sc.nextInt();
    if (choice == 1){
        for (PC pc : notebooks) {
            pc.getName();
        }
    }
    if (choice == 2){
        for (PC pc : notebooks) {
            pc.getcolor();
        }
    }
    if (choice == 3){
        for (PC pc : notebooks) {
            pc.getRAM();
        }
    }
    if (choice == 4){
        for (PC pc : notebooks) {
            pc.getMemory();
        }
    }
    return null;
}
}
