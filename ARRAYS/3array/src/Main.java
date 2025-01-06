import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {6,7,8,9,10,11,12,13};
        int [] copia = Arrays.copyOf(numeros , 8);
        Desordenar(numeros);
    }

    public static void Desordenar(int [] copia) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int numero : copia) {
            listaNumeros.add(numero);
        }
        Collections.shuffle(listaNumeros);
        System.out.println("Array desordenado");
        for (int numero : listaNumeros) {
            System.out.print(numero);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("Array original :");
        for (int numero : copia) {
            System.out.print(numero);
            System.out.print(" ");
        }
    }
}