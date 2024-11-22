import java.util.Scanner;

public class DigitosII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Hay un total de: " + contador(cadena) + " números.");

        scanner.close();
    }
    public static int contador(String cadena){
        String[] palabras = cadena.split(" ");
        int contador = 0;
        for(String palabra: palabras){
            for (int i = 0; i < palabra.length(); i++) {
                if (Character.isDigit(palabra.charAt(i))) {
                    contador++;
                    break;
                }
            }
        }
        return contador;
    }
}
