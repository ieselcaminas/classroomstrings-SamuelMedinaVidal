import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindroma(palabra)) {
            System.out.println("Palindromo.");
        }else{
            System.out.println("No palindromo.");
        }

        scanner.close();
    }
    public static boolean esPalindroma(String palabra) {
       palabra = palabra.toLowerCase();
       StringBuilder invertida = new StringBuilder(palabra);
       invertida.reverse();
       return palabra.equals(invertida.toString());
    }
}
