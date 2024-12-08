import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce base");
        int base = LeerNum();
        System.out.println("Introduce exponente");
        int exponente = LeerNum();
        int resultado;
        System.out.println("Recursiva 1 , Iterativa 2");
        int opcion=LeerNum();
        while(opcion<1 || opcion>2) {
            opcion=LeerNum();
        }
        if(opcion==1){
            resultado=Recursiva(base , exponente);
        }else{
            resultado=Iterative(base , exponente);
        }
        System.out.println(base + " elevado a " + exponente + " = " + resultado);
    }
    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int Recursiva(int base , int exponente) {
        if(exponente == 0) {
            return 1;
        }else{
            return base*Recursiva(base , exponente - 1);
        }
    }

    public static int Iterative(int base, int exponente) {
        int resultado=1;
        if(exponente == 0) {
            return 1;
        }else{
            for(int i=0 ; i<exponente ; i++){
                resultado*=base;
            }
        }
        return resultado;
    }
}