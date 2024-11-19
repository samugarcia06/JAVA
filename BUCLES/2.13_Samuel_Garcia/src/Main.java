import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha correspondiente al día
        //siguiente.
        System.out.println("Bienvenido al reloj");
        System.out.println("Dime una hora en formato hora ,minutos y segundos");
        //declaramos variables
        int ihora , imin , iseg;
        //declaramos scanner para leer la hora
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas");
        ihora = sc.nextInt();
        System.out.println("Ingrese el numero de minutos");
        imin = sc.nextInt();
        System.out.println("Ingrese el numero de segundos");
        iseg = sc.nextInt();

        if(ihora>-1 && ihora<24 && imin>-1 && imin<60 && iseg!=0 & iseg!=59 && iseg>-1 && iseg<60) {
            System.out.println("la hora es: "+ihora+": "+imin+": "+(++iseg));
        }else if(iseg==59 && imin!=59 ){
            System.out.println("la hora es: "+ihora+": " + (++imin) +": "+(0));
        }else if (ihora==23 && iseg==59 && imin==59) {
            System.out.println("la hora es: " + 00 + ": " + (0) + ": " + (0));
        }else if(imin==59 && iseg == 59) {
            System.out.println("la hora es: " + (++ihora) + ": " + (0) + ": " + (0));
        } else {
            System.out.println("formato erroneo");
        }


    }
} 