import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println(invertirCadena(cadena));

        scanner.close();
    }
    public static String invertirCadena(String cadena) {
        String[] palabras = cadena.split(" ");
        String invertida = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            invertida += palabras[i];
            if (i != 0){
                invertida += " ";
            }
        }
        return invertida;
    }
}
