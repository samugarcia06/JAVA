import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario un número impar mayor o igual a 3
        System.out.println("Ingrese un número impar mayor o igual a 3 para formar el diamante: ");
        int n = sc.nextInt();

        // Verificar si el número es impar y mayor o igual a 3
        if (n >= 3 && n % 2 != 0) {
            int mid = n / 2;

            // Parte superior del diamante (incluye la fila central)
            for (int i = 0; i <= mid; i++) {
                // Espacios iniciales para centrar
                for (int j = 0; j < mid - i; j++) {
                    System.out.print(" ");
                }

                // Números en aumento
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j);
                }

                // Números en disminución
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Nueva línea para la siguiente fila
                System.out.println();
            }

            // Parte inferior del diamante
            for (int i = mid - 1; i >= 0; i--) {
                // Espacios iniciales para centrar
                for (int j = 0; j < mid - i; j++) {
                    System.out.print(" ");
                }

                // Números en aumento
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j);
                }

                // Números en disminución
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Nueva línea para la siguiente fila
                System.out.println();
            }
        } else {
            System.out.println("El número ingresado no es válido. Debe ser impar y mayor o igual a 3.");
        }
    }
}