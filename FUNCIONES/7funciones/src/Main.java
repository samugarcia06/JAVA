import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce 1 numeros");
        int inum=LeerNum();
        System.out.println("Divisores primos : "+ Divisores(inum));

    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int Divisores( int inum) {
        int idivisor=0;
        for (int i=inum; i>0; i--) {
            if(inum%i==0) {
                if(i% 2 != 0 && i % 3 != 0 && i%5!=0 && i%7!=0 ||  i==3 || i==2 || i==5 || i==7) {
                    idivisor++;
                }
            }
        }
        return idivisor;
    }
}