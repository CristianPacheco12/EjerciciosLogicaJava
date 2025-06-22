import java.util.*;

public class cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa una cadena:");
        String s = sc.nextLine();
        
        System.out.println("Ingresa el tamaño de cada grupo (k):");
        int k = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        
        System.out.println("Ingresa el caracter de relleno:");
        char fill = sc.nextLine().charAt(0);
        
        List<String> grupos = dividirCadena(s, k, fill);
        
        System.out.println(grupos);
    }
    
    public static List<String> dividirCadena(String s, int k, char fill) {
        List<String> resultado = new ArrayList<>();
        
        int i = 0;
        while (i < s.length()) {
            StringBuilder grupo = new StringBuilder();
            
            for (int j = 0; j < k; j++) {
                if (i < s.length()) {
                    grupo.append(s.charAt(i));
                    i++;
                } else {
                    grupo.append(fill);  // Rellenar si no hay más caracteres
                }
            }
            
            resultado.add(grupo.toString());
        }
        
        return resultado;
    }
}
