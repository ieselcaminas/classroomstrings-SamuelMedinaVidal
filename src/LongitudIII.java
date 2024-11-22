import java.util.Scanner;

public class LongitudIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escríbeme una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.println("Dime una longitud de caracteres: ");
        int longitud = scanner.nextInt();

        if(esMayor(texto, longitud)){
            System.out.println("Hay alguna palabra larga.");
        }else{
            System.out.println("Todas las cadenas son cortas.");
        }

        scanner.close();
    }

    public static boolean esMayor(String texto, int longitud) {
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            if (palabra.length() >= longitud) {
                return true;
            }
        }
        return false;
    }
}
