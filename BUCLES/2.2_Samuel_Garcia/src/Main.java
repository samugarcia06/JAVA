import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");
        numero1 = sc.nextInt();
        System.out.println("Inserte un numero");
        numero2= sc.nextInt();

        if (numero1==numero2){
            System.out.println("Los numeros son igual");
        } else {
            System.out.println("Los numeros no son igual");
        }
    }
}