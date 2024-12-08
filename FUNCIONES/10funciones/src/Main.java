import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("introduce 1 numero");
        int inum1=LeerNum();
        System.out.println("Introduce otro numero");
        int inum2=LeerNum();
        while(inum1==inum2){
            System.out.println("Introduce el numero 2 de nuevo");
            inum2=LeerNum();
        }
        System.out.println(MCD(inum1,inum2));

    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int MCD(int inum1, int inum2) {
        if(inum2==0){
            return inum1;
        }else{
            return MCD(inum2,inum1%inum2);
        }
    }

}