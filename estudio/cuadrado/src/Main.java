import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE NUMERO");
        int inum=scanner.nextInt();
        for(int i=0;i<inum;i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for(int j=inum-2;j>0;j--) {
            System.out.print("*");
            for(int espacio=2;espacio<inum;espacio++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int k=0;k<inum;k++) {
            System.out.print("*");
        }
    }
}