import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9{
    public static void main(String[] args){
        ArrayList<Carta> c = new ArrayList<Carta>();

        Carta cartaAux = new Carta();
        c.add(cartaAux);

        for (int i = 0; i < 9; i++){
            do {
                cartaAux = new Carta();
            } while (c.contains(cartaAux));
            c.add(cartaAux);
        }
        
        Collections.sort(c);

        for (Carta ca : c){
            System.out.println(ca);
        }
    }
}
