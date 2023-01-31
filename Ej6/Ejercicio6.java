import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> h = new HashMap<>();
        h.get("alex");
        h.put("alex", "123456");
        h.get("jose");
        h.put("jose", "121212");
        h.get("nick");
        h.put("nick", "232323");
        int intentos = 3;
        boolean acceso = false;
        do{
            System.out.print("Introduzca su nombre de usuario: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca su contraseña: ");
            String contraseña = sc.nextLine();
            if (h.containsKey(nombre)){
                if (contraseña.equals(h.get(nombre))){
                    acceso = true;
                }
            }
            if (!acceso){
                intentos--;
                if (intentos > 0){
                    System.out.println("Su nombre de usuario o contraseña no es correcto");
                    System.out.println("Por favor, inténtelo de nuevo.");
                }
            }
        } while (!acceso && intentos > 0);

        if (!acceso && intentos == 0){
            System.out.println("Lo siento, no tiene acceso al área restingida");
        }

        if (acceso){
            System.out.println("Ha accedido al área restringida");
        }
        sc.close();
    }
}