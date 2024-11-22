import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Hay un total de: " + contador(cadena) + " dígitos.");

        scanner.close();
    }

    public static int contador(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}
