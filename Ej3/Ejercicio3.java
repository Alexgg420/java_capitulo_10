import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int cant = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(cant);
        while (cant < 10){
            System.out.print("Introduzca número: ");
            a.add(sc.nextInt());
            System.out.println();
            cant++;
        }

        Collections.sort(a);

        System.out.println("Tras ordenar los números quedaría:");
        for (Integer num: a){
            System.out.print("| " + num + " |");
        }
        sc.close();
    }
}