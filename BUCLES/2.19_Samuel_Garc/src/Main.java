import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha correspondiente al día
        //siguiente.
        System.out.println("Bienvenido al calendario");
        System.out.println("Dime una fecha en formato dia ,mes y año");
        //declaramos variables
        int idia, imes, iano;
        boolean bOk = true;
        //declaramos scanner para leer la hora
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        idia = sc.nextInt();
        System.out.println("Ingrese el mes");
        imes = sc.nextInt();
        System.out.println("Ingrese el año");
        iano = sc.nextInt();
        //hacer de nuevo con switch


    }
}