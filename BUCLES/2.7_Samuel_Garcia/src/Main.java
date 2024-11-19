//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declarar variables
        int iNum1 , iNum2 , iNum3;
        //Salida de mensaje de bienvenida
        System.out.println("Bienvenido al programa que ordena 3 numeros");

        //declaracion de scanner
        Scanner sc = new Scanner(System.in);

        //entrada de los 3 numeros y declaracion de variables
        System.out.println("Introduzca primer numero");
        iNum1 = sc.nextInt();
        System.out.println("Introduzca primer numero");
        iNum2 = sc.nextInt();
        System.out.println("Introduzca primer numero");
        iNum3 = sc.nextInt();

        //condicionales para que ordene los 3 numeros de mayor a menor
        if (iNum1 > iNum2 & iNum2 > iNum3) {
            System.out.println(iNum1 + "  > " + iNum2  + " > " + iNum3);
        } else if (iNum2 > iNum1 & iNum1 > iNum3) {
            System.out.println(iNum2 + " > " + iNum1 + " > " + iNum3);
        }else if (iNum3 > iNum1 & iNum1 > iNum2) {
            System.out.println(iNum3 + " > " + iNum1 + " > " + iNum2);
        }else if (iNum1 > iNum3 & iNum3 > iNum2) {
            System.out.println(iNum1 + " > " + iNum3 + " > " + iNum2);
        }else if (iNum2 > iNum3 & iNum3 > iNum1) {
            System.out.println(iNum2 + " > " + iNum3 + " > " + iNum1);
        }else if (iNum3 > iNum2 & iNum2 > iNum1) {
            System.out.println(iNum3 + " > " + iNum2 + " > " + iNum1);
        }
    }
}