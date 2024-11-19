
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero");
        int iNum = sc.nextInt();

        if (iNum % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("tu numero es impar");
        }
    }
}