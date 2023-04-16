import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class programm3 {
public static void main(String[] args) {
    PC computer1 = new PC("DEXP","green","ryzen 2600",8,256);
    PC computer2 = new PC("HP","black","intel 10400F",16,512);
    PC computer3 = new PC("SONY","gray","ryzen 3600",16,512);
    PC computer4 = new PC("Alien","green","ryzen 3700",16,1000);
    List<PC> initListNotebooks = new ArrayList<>();
    initListNotebooks.add(computer1);
    initListNotebooks.add(computer2);
    initListNotebooks.add(computer3);
    initListNotebooks.add(computer4);
    filter(initListNotebooks);
}

}
