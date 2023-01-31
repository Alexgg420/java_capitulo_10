public class Moneda {
    private static String pos[] = {"cara", "cruz"};
    private static String mon[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private String posicion;
    private String moneda;

    public Moneda(){
        this.moneda = mon[(int)(Math.random() * 8)];
        this.posicion = pos[(int)(Math.random() * 2)];
    }

    public String getPosicion(){
        return posicion;
    }

    public String getMoneda(){
        return moneda;
    }

    public String toString(){
        return this.moneda + " - " + this.posicion;
    }
}
