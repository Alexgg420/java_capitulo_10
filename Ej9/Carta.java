import java.util.Objects;
public class Carta implements Comparable<Carta>{
    private static String [] p = {"oro", "espadas", "copas", "bastos"};
    private static String [] n = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

    private String palo;
    private Integer numero;

    public Carta(){
        this.numero = (int)(Math.random()* 10);
        this.palo = p[(int)(Math.random()* 4)];
    }

    public String getPalo(){
        return palo;
    }

    public int getNumero(){
        return numero;
    }

    public String toString(){
        return n[numero] + " de " + palo;
    }

    @Override
    public int compareTo(Carta car){
        if (palo.equals(car.getPalo())) {
            return numero.compareTo(car.getNumero());
        } else {
            return palo.compareTo(car.getPalo());
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.numero, other.numero)){
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)){
            return false;
        }
        return true;
    }
}