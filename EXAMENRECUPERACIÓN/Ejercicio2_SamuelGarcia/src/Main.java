import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce POSICION");
        int ipos=scanner.nextInt();
        while(ipos<0){
            System.out.println("introduce POSICION");
            ipos=scanner.nextInt();
        }
        System.out.println("introduce VELOCIDAD");
        int ivel=scanner.nextInt();
        while(ivel<0 || ivel>100){
            System.out.println("introduce VELOCIDAD");
            ivel=scanner.nextInt();
        }
        System.out.println("introduce ACELERACIÓN");
        int acel=scanner.nextInt();
        while(acel<5 || acel>15){
            System.out.println("introduce ACELERACIÓN");
            acel=scanner.nextInt();
        }
        System.out.println("introduce TIEMPO");
        int itiempo=scanner.nextInt();
        while(itiempo<10 || itiempo>100){
            System.out.println("introduce TIEMPO");
            itiempo=scanner.nextInt();
        }
        ipos=ipos+ivel;
        ivel=ivel+acel;
        System.out.println("Velocidad : " + ivel + "m/s");
        System.out.println("Acaleración : " + acel + "m/s^2");
        System.out.println("Posición : " + ipos + "m");
        System.out.println("Tiempo usado : " + itiempo + "s");
    }
}
