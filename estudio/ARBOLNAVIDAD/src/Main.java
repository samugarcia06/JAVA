import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int inum=scanner.nextInt();
        for (int i = 0; i<inum; i++) {
            for(int iespacios=inum; iespacios>i; iespacios--) {
                System.out.print(" ");
            }
            for (int j =0; j<=i; j++) {
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println(" ");

        }
    }
}