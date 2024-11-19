import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a reloj ");
        //variables
        int iseg,imin,ihora,iIncremento;
        System.out.println("Introduce hora , minutos , segundos :");
        //leemos hora
        ihora = scanner.nextInt();
        imin = scanner.nextInt();
        iseg = scanner.nextInt();
        int itotal1;

        //bucle para que no coja hora incorrecta
        while(iseg<61 && imin<61 && ihora<24){
            //pedimos el incremento de segundos
            System.out.println("Ingrese su numero de segundos que quieres incrementar");
            iIncremento=scanner.nextInt();

            //damos valor a la variable
            itotal1=iseg+iIncremento;
            if(itotal1>=60){
                imin+=itotal1/60;
                iseg=itotal1%60;
                if(imin>=60){
                    ihora+=imin/60;
                    imin=imin%60;
                }
                if(ihora>=24){
                    ihora=ihora%24;
                }
            }else {
                iseg+=iIncremento;
            }
            System.out.println(ihora+" : "+imin+" : "+iseg);
        }
    }
}