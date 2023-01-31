import java.util.HashMap;
import java.util.ArrayList;

public class Ejercicio12 {
    public static void main(String[] args){
        ArrayList<Carta12> a = new ArrayList<Carta12>();
        HashMap<String, Integer> ha = new HashMap<String, Integer>();
        int total = 0;

        ha.put("2", 0);
        ha.put("4", 0);
        ha.put("5", 0);
        ha.put("6", 0);
        ha.put("7", 0);
        ha.put("10", 2);
        ha.put("11", 3);
        ha.put("12", 4);
        ha.put("3", 10);
        ha.put("1", 11);

        Carta12 cartaAux = new Carta12();
        a.add(cartaAux);

        for (int i = 0; i < 5; i++){
            do {
                cartaAux = new Carta12();
            } while (a.contains(cartaAux));
            a.add(cartaAux);
        }

        for (Carta12 ca : a){
            System.out.println(ca);
            total = total + ha.get(ca.getFig());
        }
        System.out.println();
        System.out.println("Ha obtenido un total de " + total + " puntos");
    }
}
