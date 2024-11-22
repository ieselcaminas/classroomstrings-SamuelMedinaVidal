import java.util.Scanner;

public class PasaTiempos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println(palabraReemplazada(cadena));

        scanner.close();
    }
    public static String palabraReemplazada(String cadena){
        String reemplazo = "";
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                reemplazo += ".";
            } else{
                reemplazo += cadena.charAt(i);
            }
        }
        return reemplazo;
    }
}
