import java.util.ArrayList;
public class Ejercicio8 {
    public static void main(String[] args){
        ArrayList<Carta8> a = new ArrayList<Carta8>();

        Carta8 cartaAux = new Carta8();
        a.add(cartaAux);

        for (int i = 0; i < 9; i++){
            do {
                cartaAux = new Carta8();
            } while (a.contains(cartaAux));
            a.add(cartaAux);
        }
        for (Carta8 ca : a){
            System.out.println(ca);
        }
    }
}
