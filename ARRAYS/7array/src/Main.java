import java.util.Arrays;
import java.util.ArrayList;
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
        System.out.println("Cuantos elementos quieres que tenga el array");
        int numElementos = LeerNum();
        int [] Elementos = new int[numElementos];
        int num;
        for (int i = 0; i < numElementos; i++) {
            System.out.println("Rellena poisicion : " + i + " del array");
            num = LeerNum();
            Elementos[i] = num;
        }
        System.out.println("Tu array es : " + Arrays.toString(Elementos));
        System.out.println("---------------------");
        System.out.println("Cuantos elementos quieres sumar");
        System.out.println("Introduce un numero entre 1 y " + numElementos);
        int suma = LeerNum();
        while (suma > Elementos.length) {
            System.out.println("Introduce un numero entre 1 y " + numElementos);
            suma =LeerNum();
        }
        System.out.println(Arrays.toString(suma(Elementos, suma)));

    }
    public static int [] suma (int [] Elementos , int suma) {
        ArrayList<Integer> lista = new ArrayList<>();
        int sumatorioArray=0;
        for (int i = 0; i < Elementos.length; i++) {
            for (int j = 0; j < suma; j) {}
            sumatorioArray +=Elementos[i];
            lista.add(sumatorioArray);
        }
        return lista.stream().mapToInt(Integer::intValue).toArray();
    }
}
