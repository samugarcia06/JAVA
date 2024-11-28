import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce icolumnas : ");
        int icolumnas = scanner.nextInt();
        System.out.print("introduce filas : ");
        int ifilas = scanner.nextInt();

        while(ifilas > 0) {

            for(int i=icolumnas; i>0; i--) {
                for(int j=0 ; j<i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
                ifilas--;
                if(ifilas==0){
                    break;
                }
            }
        }

    }
}