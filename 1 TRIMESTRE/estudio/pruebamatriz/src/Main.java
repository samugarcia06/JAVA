import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce numero impar : ");
        int inum = scanner.nextInt();
        int inicio=inum/2;

        for(int i=-inicio; i<=inicio; i++) {
            for(int j=-inicio; j<=inicio; j++) {
                System.out.print(inum-Math.abs(i)-Math.abs(j));
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}