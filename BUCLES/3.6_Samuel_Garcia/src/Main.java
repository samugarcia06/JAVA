import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos variable
        int inum ;
        Scanner sc = new Scanner(System.in);

        //le pedimos al usuario un numero
        System.out.println("Introduce un numero :");
        inum = sc.nextInt();

        for (int in=0; in<=inum ; in++){
            System.out.println(in);
        }

    }
}