import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu();
    }
    public static int LeerNumEntero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static double LeerNumDecimal() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static String LeerTextos() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void Menu(){

        System.out.println("Pulsa cualquier numero para acabar seguir 0 acabar");
        int seguiracabar=1;

        while (seguiracabar !=0) {
            System.out.println("Elige el programa que quieras");
            System.out.println("1.Repetir textos");
            System.out.println("2.Cambiar euro-dollar");
            System.out.println("3.Invertir numero entero");
            int opcion = LeerNumEntero();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce numero de veces");
                    int inum = LeerNumEntero();
                    System.out.println("Introduce una palabra");
                    String spalabra = LeerTextos();
                    RepetirTextos(inum, spalabra);
                    break;
                case 2:
                    System.out.println("Introduce numero euros");
                    double euros = LeerNumDecimal();
                    System.out.println("Cuantos dolares son 1 euro?");
                    double indicedolares = LeerNumDecimal();
                    System.out.println("Esa cantidad de euros son " + EuroDollar(euros, indicedolares) + "$");
                    break;
                case 3:
                    System.out.println("Introduce numero para invertirlo");
                    int numero = LeerNumEntero();
                    System.out.println(invertirNumero(numero));
                    break;
            }
            System.out.println("Pulsa cualquier numero para seguir y 0 para terminar");
            seguiracabar= LeerNumEntero();
        }
    }
    public static void RepetirTextos(int inum , String spalabra) {

        for (int i = 0; i < inum; i++) {
            System.out.print(spalabra);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static double EuroDollar(double euros , double indicedolares) {

        if(indicedolares > 0 && indicedolares <100) {
            return indicedolares*euros;
        }else{
            return 0;
        }
    }

    public static int invertirNumero(int numero) {
        int reves = 0;
        while (numero != 0) {
            //cada digito sera el resto de dividirlo entre 10
            int digito = numero % 10;
            //el numero al reves es el numero*10 para moverlo de unidad e irle sumando el digito anterior. 123-> 3*100+2*10+1=321
            reves = reves * 10 + digito;
            numero /= 10;
        }
        return reves;
    }

}
