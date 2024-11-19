import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to school");
        System.out.println("Give me a note beetwen 0-10");
        //declaramos variables
        int inota;
        //declaramos scanner para leer la nota
        Scanner sc = new Scanner(System.in);
        inota = sc.nextInt();

        switch (inota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota no valida");

        }
    }
}









