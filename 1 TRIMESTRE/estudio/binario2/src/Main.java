import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero decimal");
        int inum=scanner.nextInt();
        int idigito=0;
        while(inum>0){
            idigito=inum%2;
            System.out.print(idigito);
            System.out.print(" ");
            inum/=2;
        }
        System.out.println(" ");
        System.out.println("leer al reves ");
    }
}