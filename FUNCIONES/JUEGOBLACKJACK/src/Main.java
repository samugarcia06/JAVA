import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
       Menu();
       int i=0;
       while(i!=2 && i!=1){
           i=LeerNum();
       }
       Comenzar(i);
    }
    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void Menu(){
        System.out.println("Blackjack");
        System.out.println("1.Comenzar");
        System.out.println("2.Cerrar");
    }

    public static void Comenzar(int i){
       if(i==1){
           Juego();
       }else{
           System.out.println("Fin");
       }
    }
    public static void Juego(){
        Random aleatorio = new Random();
         int carta2=aleatorio.nextInt(7)+15;
         int opcion =1;
         int suma=0;
         int carta;
         while(opcion==1){;
            carta=(int) (Math.random()*12);
            suma+=carta;
            System.out.println("Suma de tus cartas = "+suma);
            if(suma==21){
                System.out.println("Has ganado");
                System.out.println("Suma crupier " + carta2);
                break;
            }else if(suma>21){
                System.out.println("Has perdido");
                break;
            }
            System.out.println("Seguir(1) Plantarse(2)");
            opcion=LeerNum();

         }
         if(opcion==2){
             if(suma>carta2){
                 System.out.println("Has ganado");
                 System.out.println("Suma crupier " + carta2);
             }else if(suma<carta2){
                 System.out.println("Has perdido");
                 System.out.println("Suma crupier " + carta2);
             }else{
                 System.out.println("Empate");
             }
         }
    }
}