import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce hora1");
        int ihora1 = LeerNum();
        System.out.println("Introduce minuto1");
        int imin1 = LeerNum();
        System.out.println("Introduce hora2");
        int ihora2 = LeerNum();
        System.out.println("Introduce minuto2");
        int imin2 = LeerNum();
        System.out.println("Diferencia de minutos : " + Diferencia(ihora1,imin1,ihora2,imin2) + " minutos");
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int Diferencia(int ihora1,int imin1, int ihora2, int imin2) {
        return Math.abs(ihora1*60 - ihora2*60) + Math.abs(imin1 - imin2);
    }
}