public class Carta8 {
    private static String [] p = {"oro", "espadas", "copas", "bastos"};
    private static String [] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

    private String palo;
    private String numero;

    public Carta8(){
        this.numero = n[(int)(Math.random()* 10)];
        this.palo = p[(int)(Math.random()* 4)];
    }

    public String getPalo(){
        return this.palo;
    }

    public String getNumero(){
        return this.numero;
    }

    public String toString(){
        return this.numero + " de " + this.palo;
    }

}
