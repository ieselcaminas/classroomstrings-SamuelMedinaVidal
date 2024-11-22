import java.util.Scanner;

public class Alfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una palabra: ");
        String palabra = scanner.nextLine();

        if (esAlfabetica(palabra)){
            System.out.println("La palabra está ordenada alfabéticamente.");
        }else{
            System.out.println("La palabra no está ordenada alfabéticamente.");
        }

        scanner.close();
    }
    public static boolean esAlfabetica(String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 1; i < palabra.length(); i++) {
            if (palabra.charAt(i) < palabra.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

}
