import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inum, inumOriginal; //variable para introducir numero
        int iUnidades , iDecenas , iCentenas , iUnidadmillar; //variables para cada digito
        boolean blnCapicua = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero y te dire si es capicúa");
        inum = sc.nextInt();
        inumOriginal = inum;

        if(inum>=1 && inum<=9999){
            iUnidades = inum%10;//para sacar unidades saco modulo numero entero
            inum=inum/10; //unidadesivide al numero entre 10 para eliminar
            iDecenas = inum%10;
            inum=inum/10;
            iCentenas = inum%10;
            inum=inum/10;
            iUnidadmillar = inum%10;

            if(inumOriginal<10){
                blnCapicua = true;
            }else if( inumOriginal<100){
                if(iUnidades==iDecenas){
                    blnCapicua = true;
                }
            }else if( inumOriginal<1000){
              if(iUnidades==iCentenas){
                  blnCapicua = true;
              }
            }else if( inumOriginal<10000){
                if(iUnidades==iUnidadmillar && iCentenas==iDecenas){
                    blnCapicua = true;
                }
            }

            if(blnCapicua){
                System.out.println("El numero es capicua");
            }else{
                System.out.println("El numero no es capicua");
            }

        }else{
            System.out.println("FUERA RANGO");
        }



    }
}