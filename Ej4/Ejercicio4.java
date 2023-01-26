import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int cant = 0;
        ArrayList<String> a = new ArrayList<String>(cant);
        while (cant < 10){
            System.out.print("Introduzca palabra (todo en minúsculas): ");
            a.add(sc.nextLine());
            System.out.println();
            cant++;
        }

        Collections.sort(a);

        System.out.println("Tras ordenar las palabras quedaría:");
        for (String palabra: a){
            System.out.print("| " + palabra + " |");
        }
        sc.close();
    }
}
