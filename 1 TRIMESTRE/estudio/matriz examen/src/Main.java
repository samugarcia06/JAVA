import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero");
        int inum = scanner.nextInt();
        int icentro=inum/2;
        for(int i=-icentro ; i<=icentro ; i++){
            for(int j=-icentro ; j<=icentro ; j++){
                System.out.print(inum-Math.abs(i)-Math.abs(j));
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}