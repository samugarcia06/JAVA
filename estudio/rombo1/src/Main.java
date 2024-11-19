import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce numero lado");
        int inum=scanner.nextInt();

        //primer asterisco solitario
        for (int i1=0;i1<1;i1++){
            for(int iespacios=0;iespacios<inum;iespacios++){
                System.out.print(" ");
            }
                System.out.print("*");
        }
        System.out.println(" ");

        // parte superior
        for(int i1=2;i1<inum;i1++) {
            for(int iespacios=inum;iespacios>i1;iespacios--) {
                            System.out.print(" ");
            }
            System.out.print("*");
            for(int iespaciosm=i1+i1-1;iespaciosm>0;iespaciosm--) {
                            System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" ");
        }

        //parte inferior
        for(int i1=inum;i1>1;i1--) {
            for(int iespacios=i1;iespacios<inum;iespacios++) {
                            System.out.print(" ");
            }
            System.out.print("*");
            for(int iespaciosm=i1+i1-1;iespaciosm>0;iespaciosm--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" ");
        }

        //ultimo solitario
        for (int i1=0;i1<1;i1++){
            for(int iespacios=0;iespacios<inum;iespacios++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
