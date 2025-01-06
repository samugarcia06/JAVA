import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce dias");
        int idia = LeerNum();
        System.out.println("Introduce horas");
        int ihora = LeerNum();
        System.out.println("Introduce minutos");
        int iminuto = LeerNum();
        System.out.println("Numero de segundos : " + MuestraSegundos(idia , ihora , iminuto));
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static float MuestraSegundos(int idia , int ihora , int iminuto) {
        return (float) idia * 86400+ (float)ihora* 3600 + (float)iminuto*60;
    }

}
