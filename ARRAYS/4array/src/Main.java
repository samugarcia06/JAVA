
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static ArrayList<Integer> introducirSueldos() {
        ArrayList<Integer> sueldos = new ArrayList<>();
        int sueldo;
        do {
            System.out.print("Introduce un sueldo: ");
            sueldo = LeerNum();
            if (sueldo != -1) {
                sueldos.add(sueldo);
            }
        } while (sueldo != -1);

        return sueldos;
    }


    public static void ordenarSueldos(ArrayList<Integer> sueldos) {
        sueldos.sort(Collections.reverseOrder());
        for (int s : sueldos) {
            System.out.print(s + " ");
        }
    }

    public static void mostrarMaxMin(ArrayList<Integer> sueldos) {
        if (!sueldos.isEmpty()) {
            int maximo = Collections.max(sueldos);
            int minimo = Collections.min(sueldos);

            System.out.println("\nSueldo máximo: " + maximo);
            System.out.println("Sueldo mínimo: " + minimo);
        } else {
            System.out.println("\nNo se han introducido sueldos.");
        }
    }

    public static double calcularMedia(ArrayList<Integer> sueldos) {
        int suma = 0;
        for (int sueldo : sueldos) {
            suma += sueldo;
        }
        return (double) suma / sueldos.size();
    }


    public static void Menu() {
        System.out.println("Introduce opcion");
        System.out.println("1.Ordenar sueldos");
        System.out.println("2.Ver max y min");
        System.out.println("3.Obtener media sueldos");
        int opcion = LeerNum();
        switch (opcion) {
            case 1:
                ordenarSueldos(introducirSueldos());
                break;
            case 2:
                mostrarMaxMin(introducirSueldos());
                break;
            case 3:
                System.out.println(calcularMedia(introducirSueldos()));
                break;
        }
    }
}