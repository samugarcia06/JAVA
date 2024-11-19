import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos variable
        int inum;
        Scanner sc = new Scanner(System.in);

        //le pedimos al usuario un numero
        System.out.println("Introduce un numero :");
        inum= sc.nextInt();

        while(inum!=0) {
            System.out.print("Tu numero es:");

           if (inum % 2 == 0) {
                System.out.print("par , ");
            } else {
                System.out.print("impar , ");
            }
            //decimos si el numero es negativo o positivo
            if (inum > 0) {
                System.out.print("positivo , ");
            } else {
                System.out.print("negativo , ");
            }
            //elevamos el numero al cuadrado
            System.out.println(" al cuadrado= " + inum * inum);
            break;
        }
    }
}
