import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio10 {
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

        System.out.println("Intruduce una de las siguientes palabras:");
        System.out.println("coche");
        System.out.println("motor");
        System.out.println("hola");
        System.out.println("mundo");
        System.out.println("casa");
        System.out.println("perro");
        System.out.println("gato");
        System.out.println("ventana");
        System.out.println("puerta");
        System.out.println("lenguaje");
        System.out.println("trabajar");
        System.out.println("esfuerzo");
        System.out.println("estudiar");
        System.out.println("parque");
        System.out.println("ordenador");
        System.out.println("carretera");
        System.out.println("palacio");
        System.out.println("diamante");
        System.out.println("gente");
        System.out.println("escribir");
        System.out.println();
        String word = sc.nextLine();

        if (hash.containsKey(word)){
            System.out.println("En inglés, " + word + " es: " + (hash.get(word)));
        }

        else {
            System.out.println("Lo siento, no conozco esa palabra");
        }
        sc.close();
    }
}
