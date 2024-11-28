import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce numero impar : ");
        int inum = scanner.nextInt();
        int iestatico=inum;
            //parte superior
            for(int bucle=0;bucle<iestatico/2;bucle++) {
                inum--;
                for(int iAntes=bucle;iAntes>0;iAntes--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int imedio=inum--;imedio>0;imedio--) {
                    System.out.print(" ");
                }

                System.out.print("*");
                System.out.println(" ");
            }

            //parte media

            for(int iespacios=iestatico/2; iespacios>0;iespacios--) {
                System.out.print(" ");
            }
            System.out.print("*");
        System.out.println(" ");

            //parte inferior
        for(int bucle=iestatico/2;bucle>0;bucle--) {
            for(int iAntes=0;iAntes<bucle-1;iAntes++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int imedio=iestatico/2;imedio>0;imedio--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" ");
        }
    }
}