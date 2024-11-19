import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int inum, isol;
        System.out.println("Escribe numero decimal y lo pasamos a binario");
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();
        while (inum != 0) {
            isol = inum % 2;
            if (isol == 0) {
                System.out.println("digito : 0");
            } else {
                System.out.println("digito : 1");
            }
            inum = inum / 2;

        }

    }
}