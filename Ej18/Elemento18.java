public class Elemento18 {
    private String nombre;
    private Double precio;
    private int cantidad;

    public Elemento18(String nombre, Double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getPrecio(){
        return this.precio;
    }

    public void setPrecio(Double precio){
        this.precio = precio;
    }

    public Integer getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
       return String.format("%-20s", this.nombre) + " || PVP: " + String.format("%6.2f", this.precio) + " || Cantidad: " + String.format("%2d", this.cantidad) + " || Subtotal: " + String.format("%6.2f", this.precio * this.cantidad);
    }
}
