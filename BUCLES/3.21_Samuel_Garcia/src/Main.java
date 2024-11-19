import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inum, ivalor;
        System.out.println("Introduce un numero");
        inum = scanner.nextInt();
        ivalor=inum;
        for(int i=0 ; i<=inum ; i++){
            for(int iespacio=ivalor--; iespacio>=0 ; iespacio-- ){
                System.out.print(" ");
            }
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
