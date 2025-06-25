public class ejercicio2 {

     public int[] anadirNumeros(int[] l1, int[] l2) {

        int[] copial1 = ordenInverso(l1);
        int[] copial2 = ordenInverso(l2);

        int n1 = devuelveNumero(copial1);
        int n2 = devuelveNumero(copial2);

        int sum = n1 + n2;

        String producto = String.valueOf(sum);
        int[] pro = new int[producto.length()];

        for (int i = 0; i < producto.length(); i++) {
            pro[i] = producto.charAt(i) - '0'; // Convertir char a int
        }
        
        int[] inverso = ordenInverso(pro);
        return inverso;
    }

 public int[] ordenInverso(int[] lista) {
    int[] listaCopia = new int[lista.length]; // Se crea un nuevo arreglo del mismo tamaño

    for (int i = lista.length - 1, j = 0; i >= 0; i--, j++) {
        listaCopia[j] = lista[i];  // Se copia del final al inicio
    }

    return listaCopia; // Se devuelve el nuevo arreglo
}

public int devuelveNumero(int[] array) {
    String numero = "";

    for (int i = 0; i < array.length; i++) {
        numero += array[i];  // Convertimos cada número en texto y lo concatenamos
    }

    return Integer.parseInt(numero);  // Convertimos el texto final a int
}

    

}
