import java.util.ArrayList;
public class Ejercicio7 {
    public static void main(String[] args){
        
        ArrayList<Moneda> a = new ArrayList<Moneda>();
        Moneda monedaAux = new Moneda();
        a.add(monedaAux);

        String lastpos = monedaAux.getPosicion();
        String lastmon = monedaAux.getMoneda();

        for (int i = 0; i < 5; i++){
            do {
                monedaAux = new Moneda();
            } while (!((monedaAux.getPosicion()).equals(lastpos)) && (!((monedaAux.getMoneda()).equals(lastmon))));
            a.add(monedaAux);
            lastmon = monedaAux.getMoneda();
            lastpos = monedaAux.getPosicion();
        }

        for (Moneda mo : a){
            System.out.println(mo);
        }
    }
}
