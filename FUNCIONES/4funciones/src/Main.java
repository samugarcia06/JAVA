
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce 2 numeros");
        int inum1=LeerNum();
        int inum2=LeerNum();
        System.out.println("El numero mayor es :" + Operacion(inum1, inum2,0));
    }


    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int Operacion(int inum1, int inum2 , int imayor ) {

        if(inum1>inum2) {
            imayor = inum1;
        }else if(inum2>inum1) {
            imayor=inum2;
        }else{
            imayor=inum1;
        }
        return imayor;
    }
}