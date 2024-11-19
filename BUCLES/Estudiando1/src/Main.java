import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero positivo");
        int inum = sc.nextInt();
        int i=1;
        while (inum <1) {
            System.out.println("introduce numero valido");
            inum = sc.nextInt();
        }
        while(i<=inum) {
            System.out.print(i);
            System.out.print(" ");
            i++;
        }
    }
}