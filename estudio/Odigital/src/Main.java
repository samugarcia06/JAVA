import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE NUMERO");
        int inum=scanner.nextInt();

        System.out.print(" ");
        for(int i=0; i<inum; i++){
            System.out.print("*");
        }
        System.out.println(" ");
        for(int j=0; j<inum; j++){

            System.out.print("*");
            for(int iespacios=0; iespacios<inum; iespacios++){
                System.out.print(" ");
            }
            System.out.println("*");

        }

        System.out.print(" ");
        for(int i=0; i<inum; i++){
            System.out.print("*");
        }


    }
}