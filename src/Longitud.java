import java.util.Scanner;

public class Longitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escríbeme una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.println("Dime una longitud de caracteres: ");
        int longitud = scanner.nextInt();

        System.out.println("Hay un total de: " + numPalabras(texto, longitud) + " coincidencias.");

        scanner.close();
    }

    public static int numPalabras(String texto, int longitud) {
        String[] palabras = texto.split(" ");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud) {
                contador++;
            }
        }
        return contador;
    }
}
