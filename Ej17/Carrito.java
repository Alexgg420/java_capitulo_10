import java.util.ArrayList;
public class Carrito {
    ArrayList<Elemento> ca = new ArrayList<Elemento>();

    public void agrega(Elemento e){
        ca.add(e);
    }

    public int numeroDeElementos(){
        return ca.size();
    }

    public double importeTotal(){
        double subtotal = 0;
        for (Elemento e : ca){
            subtotal = subtotal + (e.getPrecio() * e.getCantidad());
        }
        return subtotal;
    }

    @Override
    public String toString(){
        String pinta = "Contenido del carrito\n";
        pinta = pinta + "=======================================================================\n";
        for (Elemento e : ca){
            pinta = pinta + e + "\n";
        }
        return pinta;
    }
}
