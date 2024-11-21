import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce numero par : ");
        int inum = scanner.nextInt();
        while(inum%2!=0 || inum<0){
            System.out.print("introduce numero par : ");
            inum = scanner.nextInt();
        }
        System.out.print("introduce numero filas: ");
        int ifilas=scanner.nextInt();

        int inicio=0;
        while(ifilas>0){
            ifilas--;
            for(int i=inicio; i<inum; i+=2){
                System.out.print(i);
                System.out.print(" ");
            }
            for(int j=inum; j>=inicio; j-=2){
                System.out.print(j);
                System.out.print(" ");

            }
            System.out.println(" ");
            inicio+=2;
            inum+=2;
        }

    }
}