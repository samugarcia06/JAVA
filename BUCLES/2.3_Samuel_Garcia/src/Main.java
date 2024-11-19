import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos variables
        int numero1 , numero2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");
        numero1 = sc.nextInt();
        System.out.println("Inserte un numero");
        numero2= sc.nextInt();


        if (numero1 > numero2) {
            System.out.print(numero1 + " es mayor que " + numero2);
        }
       else if (numero2 > numero1) {
            System.out.print(numero2 + " es mayor que " + numero1);
        }
        else {
            System.out.print(numero1 + " es igual que " + numero2);
        }





    }
}