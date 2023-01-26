import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cant = (int)(Math.random() * (20 - 10 + 1) + 10);
        int total = 0;
        int max = 0;
        int min = 100;
        ArrayList<Integer> a = new ArrayList<Integer>(cant);
        for (int i = 0; i < cant; i++){
            a.add(i, (int)(Math.random()* 101));
        }
        for (Integer numero: a){
            System.out.println(numero);
            total = total + numero;
            if (max < numero){
                max = numero;
            }
            if (min > numero){
                min = numero;
            }
        }

        System.out.println("La suma de todos es: " + total);
        System.out.println("La media es: " + (total / cant));
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);

        sc.close();
    }
}