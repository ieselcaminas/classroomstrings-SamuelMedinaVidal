import java.util.Scanner;

public class SumaBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número binario: ");
        String binario1 = scanner.nextLine();
        System.out.println("Dime otro: ");
        String binario2 = scanner.nextLine();

        System.out.println(hacerSuma(binario1, binario2));

        scanner.close();
    } public static String hacerSuma(String binario1, String binario2) {
        int numDecimal1 = Integer.parseInt(binario1, 2);
        int numDecimal2 = Integer.parseInt(binario2, 2);

        int suma = numDecimal1 + numDecimal2;

        return Integer.toBinaryString(suma);
    }
}
