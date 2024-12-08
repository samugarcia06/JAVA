import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MostrarMenu();
        int ieleccion = scanner.nextInt();
        int radio=0 , altura=0 ;
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
        System.out.println("introduce radio(m)");
        radio = LeerNum();
        double dblformulaArea=2*3.14*Math.pow(radio,2);
        System.out.println(dblformulaArea+"m²");
    }
    public static void CalcularVolumen(int radio, int altura){
        System.out.println("introduce radio(m)");
        radio = LeerNum();
        System.out.println("introduce altura(m)");
        altura = LeerNum();
        double dblformulaVolumen=3.14*Math.pow(radio,2)*altura;
        System.out.println(dblformulaVolumen+"m³");
    }
    public static void MostrarMenu(){
        System.out.println("Calcular volumen pulsa 1");
        System.out.println("Calcular area pulsa 2");
    }

}