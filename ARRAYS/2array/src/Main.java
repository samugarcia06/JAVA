import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {6,7,8,9,10,11,12,13};
        Desordenar(numeros);
    }

    public static void Desordenar(int [] numeros) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int numero : numeros) {
            listaNumeros.add(numero);
        }
        Collections.shuffle(listaNumeros);
        for (int numero : listaNumeros) {
            System.out.print(numero);
            System.out.print(" ");
        }
    }
}