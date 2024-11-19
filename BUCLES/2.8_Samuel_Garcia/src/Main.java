//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       float fa, fb , fc;

       Scanner sc = new Scanner(System.in);
       System.out.println("Bienvenido a la calculadora de ecuaciones de segundo grado");
       System.out.println("Introduce el valor a");
       fa = sc.nextInt();
       System.out.println("Introduce el valor b");
       fb = sc.nextInt();
       System.out.println("Introduce el valor c");
       fc = sc.nextInt();
       float fraiz= fb*fb - 4*fa*fc ;
       double dsol1= ((-fb + Math.pow(fraiz,0.5))/ 2 * fa);
       double dsol2=((-fb - Math.pow(fraiz,0.5))/ 2 * fa);

       if(fraiz>=0){
            System.out.println(" x1: "+dsol1+ " x2: "+dsol2);
       }else{
         System.out.println("El valor no es valido");
       }

    }
}