import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame radio(m)");
        int radio=LeerNum();
        System.out.println("introduce altura(m)");
        int altura=LeerNum();
        System.out.flush();
        System.out.println("Calcular volumen pulsa 1");
        System.out.println("Calcular area pulsa 2");
        int ieleccion = scanner.nextInt();
        Opciones(ieleccion,radio,altura);
    }
    public static void Opciones(int ieleccion, int radio , int altura){
        if(ieleccion==1){
            CalcularVolumen(radio,altura);
        }else if(ieleccion==2){
            CalcularArea(radio);
        }else{
            System.out.println("elección no valida");
        }
    }
    public static int LeerNum(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void CalcularArea(int radio){
        double dblformulaArea=2*3.14*Math.pow(radio,2);
        System.out.println(dblformulaArea+"m²");
    }
    public static void CalcularVolumen(int radio, int altura){
        double dblformulaVolumen=3.14*Math.pow(radio,2)*altura;
        System.out.println(dblformulaVolumen+"m³");
    }
}