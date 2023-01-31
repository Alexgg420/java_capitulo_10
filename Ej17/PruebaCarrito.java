public class PruebaCarrito{
    public static void main(String[] args){
        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
        miCarrito.agrega(new Elemento("Canon EOS 2000D", 449.00, 1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a "+ String.format("%.2f", miCarrito.importeTotal()) + " euros");
        System.out.println("\nContinúa la compra...\n");
        miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199.00, 3));
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
        System.out.println(miCarrito);
        System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a "+ String.format("%.2f", miCarrito.importeTotal()) + " euros");
    }
}