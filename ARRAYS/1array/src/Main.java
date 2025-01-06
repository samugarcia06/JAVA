
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce una clave del 0 al 4");
        int clave = LeerNumeros();
        String[] nombres = {"Samuel", "Rocio", "Juanito", "Pepito", "Ugeda"};
        System.out.println("El numero " + clave + " corresponde al nombre de " + buscarTodos(clave, nombres));
    }

    public static int LeerNumeros() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String buscarTodos(int clave, String[] nombres) {
        if (nombres.length < clave) {
            return null;
        } else {
            return nombres[clave];
        }
    }
}