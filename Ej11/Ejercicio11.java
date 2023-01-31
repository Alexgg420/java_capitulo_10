import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("coche", "car");
        hash.put("motor", "engine");
        hash.put("hola", "hello");
        hash.put("mundo", "world");
        hash.put("casa", "house");
        hash.put("perro", "dog");
        hash.put("gato", "cat");
        hash.put("ventana", "window");
        hash.put("puerta", "door");
        hash.put("lenguaje", "language");
        hash.put("trabajar", "work");
        hash.put("esfuerzo", "effort");
        hash.put("estudiar", "study");
        hash.put("parque", "park");
        hash.put("ordenador", "computer");
        hash.put("carretera", "road");
        hash.put("palacio", "palace");
        hash.put("diamante", "diamond");
        hash.put("gente", "people");
        hash.put("escribir", "write");

        String [] a = hash.keySet().toArray(new String[0]);
        ArrayList<Integer> num = new ArrayList<Integer>();

        int i = 0;
        int numero;
        int puntos = 0;
        String palabra;

        for (i = 0; i < 5; i++){
            do {
                numero = (int)(Math.random() * 21);
            } while (num.contains(numero));
            num.add(numero);
        }
        System.out.println("Introduzca la traducción de estas palabras:");
        for (i = 0; i < 5; i++){
            System.out.print(a[num.get(i)] + ": ");
            palabra = sc.nextLine();
            if (palabra.equals(hash.get(a[num.get(i)]))){
                System.out.println("Correcto!");
                puntos++;
            } else {
                System.out.println("Lo siento, ha fallado.");
            }
        }
        System.out.println("Ha obtenido " + puntos + " puntos.");
        sc.close();
    }
}