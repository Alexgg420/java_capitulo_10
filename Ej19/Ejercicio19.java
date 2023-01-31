import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> ha = new HashMap<String, String>();
        ha.put("caliente", "hot");
        ha.put("ardiente", "hot");
        ha.put("abrasador", "hot");
        ha.put("rojo", "red");
        ha.put("verde", "green");
        ha.put("agujetas", "stiff");
        ha.put("hierro", "iron");
        ha.put("grande", "big");

        String palabra = "";
        do {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            palabra = sc.nextLine();
            if (palabra != "salir"){
                if (!ha.containsKey(palabra)){
                    System.out.println("Lo siento, no conozco esa palabra.");
                }
            }
        } while (palabra != "salir");
        sc.close();
    }

    public boolean sinonimos(String palabra, HashMap<String, String> dic){
        String sig = dic.get(palabra);
        int cont = 0;

        for (Map.Entry ent : dic.entrySet()){
            if (ent.getValue().equals(sig)){
                cont++;
            }
        }
        return cont > 0;
    }
}
