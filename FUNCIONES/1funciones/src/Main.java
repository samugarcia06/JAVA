import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce palabra");
        String spalabra = scanner.nextLine();
        System.out.println("cuantas veces quiere que se repita");
        int inum = scanner.nextInt();
        Eco(inum, spalabra);
    }


    public static void Eco(int inum, String spalabra) {
        for (int i = 0; i < inum; i++) {
            System.out.println(spalabra);
        }
    }
}