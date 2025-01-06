
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void Menu() {
        System.out.println("Introduce valores en la matriz : ");
        int [][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce valores de la fila " + (i + 1) + " : ");
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = LeerNum();
            }
            System.out.println(" ");
        }
        mostrarMatriz(matriz);
        System.out.println(MatrizMagica(matriz));

    }

    public static boolean MatrizMagica (int [][] matriz) {
      //calcular la suma mágica
        int sumaMagica = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaMagica += matriz[0][i];
        }

        //calcular filas y columnas
        int sumaFilas=0 , sumaColumnas=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFilas += matriz[i][j];
                sumaColumnas += matriz[j][i];
            }
        }
        if (sumaFilas == sumaMagica*matriz.length && sumaColumnas == sumaMagica*matriz.length) {
            return true;
        }else {
            return false;
        }

    }

    public static void mostrarMatriz (int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}