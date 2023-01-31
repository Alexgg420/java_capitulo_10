import java.util.ArrayList;
public class Carrito18{
    ArrayList<Elemento18> ca = new ArrayList<Elemento18>();

    public void agrega(Elemento18 e){
        boolean found = false;
        for (Elemento18 ele : ca){
            if (ele.getNombre().equals(e.getNombre())){
                ele.setCantidad(ele.getCantidad() + e.getCantidad());
                found = true;
            }
        }
        if (!found){
            ca.add(e);
        }
    }

    public int numeroDeElementos(){
        return ca.size();
    }

    public double importeTotal(){
        double subtotal = 0;
        for (Elemento18 e : ca){
            subtotal = subtotal + (e.getPrecio() * e.getCantidad());
        }
        return subtotal;
    }

    @Override
    public String toString(){
        String pinta = "Contenido del carrito\n";
        pinta = pinta + "=======================================================================\n";
        for (Elemento18 e : ca){
            pinta = pinta + e + "\n";
        }
        return pinta;
    }
}
