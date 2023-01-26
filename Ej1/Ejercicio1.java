import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> a = new ArrayList<String>();
        a.add("Alejandro");
        a.add("Juanma");
        a.add("Marina");
        a.add("Marco");
        a.add("Nicole");
        a.add("Juan");

        for (String nombre : a){
            System.out.println(nombre);
        }
        sc.close();
    }
}