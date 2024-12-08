import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MostrarMenu();
        int opcion=LeerNum();
        System.out.println("Dame 2 numeros");
        double inum1=LeerNum();
        double inum2=LeerNum();
        System.out.println(Operacion(opcion,inum1,inum2));

    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void MostrarMenu(){
        System.out.println("Elige una opcion");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Dividir");
        System.out.println("4.Multiplicar");
    }
    public static double Suma(double inum1,double inum2){
        return inum1+inum2;
    }
    public static double Resta(double inum1,double inum2){
        return inum1-inum2;
    }
    public static double Dividir(double inum1,double inum2){
        if(inum2==0){
            System.out.println("División entre cero");
        }
        return inum1/inum2;
    }
    public static double Multiplicar(double inum1,double inum2){
        return inum1*inum2;
    }
    public static double Operacion(int opcion , double inum1 , double inum2 ){
        return switch (opcion) {
            case 1 -> Suma(inum1, inum2);
            case 2 -> Resta(inum1, inum2);
            case 3 -> Dividir(inum1, inum2);
            case 4 -> Multiplicar(inum1, inum2);
            default -> opcion;
        };
    }
}