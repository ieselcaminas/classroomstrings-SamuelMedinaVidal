import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cadena: ");
        String cadena = scanner.nextLine();

        if (parentizada(cadena)){
            System.out.println("Está bien parentizada.");
        }else{
            System.out.println("No está bien parentizada.");
        }

        scanner.close();
    }
    public static boolean parentizada(String cadena) {
        int valor = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == '('){
                valor++;
            }else if(cadena.charAt(i) == ')'){
                valor--;
                if (valor < 0){
                    return false;
                }
            }
        }
        return valor == 0;
    }
}
