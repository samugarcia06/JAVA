import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int inum=LeerNum();
        MuestraPares(inum);

    }
    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void MuestraPares(int inum){
        int numeroPares=0;
        for(int i=0 ; i<=inum ; i++){
            if(i%2==0){
                numeroPares++;
                System.out.print(i +" ");
            }
        }
        System.out.println("El numero pares es: "+numeroPares);
    }
}

