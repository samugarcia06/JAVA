import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[];
        int opcion = -1;
        notas = new double[100];

        do {
            Menu();

        } while (opcion != 0);
    }

    public static void Menu() {
        System.out.println("Ejemplo arrays");
        System.out.println("0. Crear el archivo");
        System.out.println("1. Inicializar una sola posicion");
        System.out.println("2. Inicializar todo el array");
        System.out.println("3. Buscar y contar un determinado rango de valor");
        System.out.println("5. Mostrar el valor de una posicon");
        System.out.println("6. Mostrar un rango de posiciones");
    }

    public static int LeerNum(int inum,int imaximo, int iminimo){
        Scanner scanner = new Scanner(System.in);
        while(inum>imaximo || inum<iminimo){
            inum=scanner.nextInt();
        }
        return inum;
    }
}