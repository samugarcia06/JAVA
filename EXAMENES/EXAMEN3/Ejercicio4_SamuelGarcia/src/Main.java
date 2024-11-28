
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce ancho");
        int mitadAncho=scanner.nextInt();
        //primera línea
        for(int i=mitadAncho*2; i>0 ;i--){
            System.out.print("+");
        }
        System.out.println(" ");

        //parte media
        int iestaticoMedio=mitadAncho/2;
        int iestaticoAntes=mitadAncho-1;

            for(int j=1; j<=mitadAncho-1; j++){
                for(int iantes=iestaticoAntes; iantes>0 ; iantes--){
                    System.out.print("+");
                }
                for(int imedio=iestaticoMedio/2; imedio>0 ; imedio--){
                    if(j%2==0){
                        System.out.print("==");
                    }else{
                        System.out.print("OO");
                    }
                }
                for(int iantes=iestaticoAntes; iantes>0 ; iantes--){
                    System.out.print("+");
                }
                System.out.println(" ");
                iestaticoMedio+=2;
                iestaticoAntes--;
            }
        //ultima linea
        for(int ultimo=mitadAncho*2-2; ultimo>0 ;ultimo--){
            System.out.print("+");
            if(ultimo==mitadAncho){
                System.out.print("UU");
            }
        }
    }
}


