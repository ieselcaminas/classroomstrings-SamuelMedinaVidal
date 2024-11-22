import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println(transformarSiglas(cadena));

        scanner.close();
    }
    public static String transformarSiglas(String cadena) {
        String[] palabras = cadena.split(" ");
        String siglas = "";
        for (int i = 0; i < palabras.length; i++) {
            if (Character.isUpperCase(palabras[i].charAt(0))) {
                siglas += palabras[i].charAt(0);
            }
        }
        return siglas;
    }
}
