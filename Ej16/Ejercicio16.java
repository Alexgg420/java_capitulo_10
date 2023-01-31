import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("Espana", "Madrid");
        hash.put("Portugal", "Lisboa");
        hash.put("Francia", "París");

        String pais;

        do {
            System.out.println("Escribe el nombre de un país (con su inicial mayúscula y su tilde si la tiene) y te diré su capital: ");
            pais = sc.nextLine();
            String capital;
            if (hash.containsKey(pais)){
                System.out.println("Su capital es: " + hash.get(pais));
            }
            else {
                System.out.println("Lo siento, no conozco ese país. ¿Cuál es su capital?: ");
                capital = sc.nextLine();
                hash.put(pais, capital);
                System.out.println("Gracias por enseñarme cuál es la capital de " + pais);
            }
        } while (pais != "salir");
        sc.close();

    }
}
