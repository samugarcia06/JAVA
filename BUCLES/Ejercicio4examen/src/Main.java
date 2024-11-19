import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ialto , iancho;
        System.out.println("Introduce alto");
        ialto = sc.nextInt();
        System.out.println("Introduce ancho");
        iancho = sc.nextInt();
        int i=0;
        int j;
        while(i<ialto){
            i++;
            j=iancho--;
            while(j>1){
                j--;
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}