import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Calcular superficie(1) , volumen(2)");
        int iopcion=LeerNum();
        while(iopcion!=1 && iopcion!=2){
            System.out.println("Introduce un numero valido");
            iopcion=LeerNum();
        }
        System.out.println("Introduce el radio");
        double radio=LeerNum();
        if(iopcion==1){
            System.out.println(Superficie(radio) + "m²");

        }else{
            System.out.println(Volumen(radio)+ "m³");

        }
        }
    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double Superficie(double radio){
        return 4*3.14*(Math.pow(radio, 2));
    }
    public static double Volumen(double radio){
        return ((4*3.14)/3)*Math.pow(radio, 3);
    }
    }

