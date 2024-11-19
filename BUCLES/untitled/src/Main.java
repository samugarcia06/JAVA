import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();


        for (int i = 0; i < filas; i++) {
            // Espacios para alinear la pirámide
            for (int j = 1; j <= filas - i - 1; j++) {
                System.out.print(" ");
            }

            int num = 1;
            System.out.print(num);

            // Calcular y imprimir los números de la fila
            for (int j = 1; j <= i; j++) {
                num = num * (i - j + 1) / j;
                System.out.print(" " + num);
            }

            System.out.println();
        }
    }
}