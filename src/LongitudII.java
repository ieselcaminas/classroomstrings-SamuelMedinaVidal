import java.util.Scanner;

public class LongitudII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escríbeme una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.println("Dime una longitud de caracteres: ");
        int longitud = scanner.nextInt();

        if(coincidencias(texto, longitud)){
            System.out.println("Existe al menos una palabra que tiene la longitud marcada.");
        }else{
            System.out.println("No existen coincidencias.");
        }

        scanner.close();
    }

    public static boolean coincidencias(String texto, int longitud) {
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            if (palabra.length() == longitud) {
                return true;
            }
        }
        return false;
    }
}
