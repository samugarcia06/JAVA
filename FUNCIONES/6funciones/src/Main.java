
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce 1 numeros");
        int inum1=LeerNum();
        System.out.println("Primo = " + Primo(inum1));

    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static boolean Primo(int inum1) {
        boolean primo;
        primo= inum1 % 2 != 0 && inum1 % 3 != 0 && inum1%5!=0 && inum1%7!=0 ||  inum1==3 || inum1==2;
       return primo;
    }
}