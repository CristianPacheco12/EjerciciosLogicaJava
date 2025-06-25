import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        HashMap<Character, Integer> conteo = new HashMap<>();

        for (char c : palabra.toCharArray()) {
            if (conteo.containsKey(c)) {
                conteo.put(c, conteo.get(c) + 1);
            } else {
                conteo.put(c, 1);
            }
        }

        System.out.println("Frecuencia de letras:");
        for (Map.Entry<Character, Integer> entrada : conteo.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }
    }
}
