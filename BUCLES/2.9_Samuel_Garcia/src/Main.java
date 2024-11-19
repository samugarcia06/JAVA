import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al programa de contador de cifras");
        System.out.println("Introduce un numero entre el 0 y el 99.999");
        //declaramos variable
        int inum;
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();
        //declaramos una variable de cantidad de digitos
        int cantidadDigitos=0;

        if (inum>0 && inum<100000) {
            if(inum>=10000 ){
                cantidadDigitos = 5;
            }else if(inum>=1000){
                cantidadDigitos = 4;
            }else if(inum>=100){
                cantidadDigitos = 3;
            }else if(inum>=10){
                cantidadDigitos = 2;
            }else if(inum>=1){
                cantidadDigitos = 1;
            }
            System.out.println(cantidadDigitos + " digitos ");
        }else {
            System.out.println("Numero fuera de rango");
        }
    }
}