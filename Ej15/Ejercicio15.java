import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> ha = new HashMap<String, Double>();
        ha.put("avena", 2.21);
        ha.put("garbanzos", 2.39);
        ha.put("tomate", 1.59);
        ha.put("jengibre", 3.13);
        ha.put("quinoa", 4.50);
        ha.put("guisantes", 1.60);

        String producto = "";
        int cantidad = 0;

        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        do {
            System.out.print("Producto: ");
            producto = sc.nextLine();
            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());
                if (a1.contains(producto)){
                    int posicion = a1.indexOf(producto);
                    a2.set(posicion, a2.get(posicion) + cantidad);
                } else {
                    a1.add(producto);
                    a2.add(cantidad);
                }
            } 
        } while (!producto.equals("fin"));

        System.out.println("Introduzca código de descuento si tiene (si no, pulse INTRO): ");
        String dto = sc.nextLine();

        System.out.println("Producto        Precio     Cantidad      Total");
        System.out.println("----------------------------------------------");
        double tot = 0;

        for (int i = 0; i < a1.size(); i++){
            String prod = a1.get(i);
            double prec = ha.get(prod);
            int cant = a2.get(i);
            double subtot = ha.get(prod) * a2.get(i);
            tot = tot + subtot;
            System.out.printf("%-10s %10.2f %10d %13.2f\n", prod, prec, cant, subtot);
        }

        double descuento = 0;
        if (dto.equals("ECODTO")){
            descuento = tot / 10;
            tot = tot - descuento;
        }
        System.out.println("----------------------------------------------");
        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.println("----------------------------------------------");
        System.out.printf("Total: %4.2f\n", tot);
        sc.close();
    }
}