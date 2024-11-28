import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //DECLARAMOS VARIABLES PARA 2 JUGADORES

    int inum1J1 , inum2J1 , inum1J2 , inum2J2 ;
    int inumSeisesJ1 = 0 , inumSeisesJ2 = 0 ;
    int sumaNum1=0 , sumaNum2=0 ;
    System.out.println("Jugador 1 introduce primer digito");
    inum1J1 = scanner.nextInt();
    System.out.println("Jugador 1 introduce segundo digito");
    inum2J1 = scanner.nextInt();

    System.out.println("Jugador 2 introduce primer digito");
    inum1J2 = scanner.nextInt();
    System.out.println("Jugador 2 introduce segundo digito");
    inum2J2 = scanner.nextInt();

    if (inum1J1>0 && inum1J1<7 && inum2J1>0 && inum2J1<7 && inum1J2>0 && inum1J2<7 && inum2J2>0 && inum2J2<7){

        if(inum1J1==6 && inum2J1==6){
            inumSeisesJ1=2;
            sumaNum1 =  inum1J1+ inum2J1 ;
        }else if(inum2J1==6){
            inumSeisesJ1++;
            sumaNum1 =  inum1J1+ inum2J1 ;
        }else if(inum1J1==6){
            sumaNum1 =  inum1J1+ inum2J1 ;
            inumSeisesJ1++;
        }else{
            sumaNum1 =  inum1J1+ inum2J1 ;
        }


        if(inum1J2==6 && inum2J2==6){
            inumSeisesJ2=2;
            sumaNum2 =  inum1J2+ inum2J2 ;
        }else if(inum1J2==6){
            sumaNum2 =  inum1J2+ inum2J2 ;
            inumSeisesJ2++;
        }else if(inum2J2==6){
            sumaNum2 =  inum1J2+ inum2J2 ;
            inumSeisesJ2++;
        }else{
            sumaNum2 =  inum1J2+ inum2J2 ;
        }


        if(inumSeisesJ1 > inumSeisesJ2){
            System.out.println("el ganador es el jugador 1 ");
        }else if(inumSeisesJ2 > inumSeisesJ1){
            System.out.println("el ganador es el jugador 2 ");
        }else if(inumSeisesJ1==inumSeisesJ2){
            if(sumaNum1>sumaNum2){
                System.out.println("el ganador es el jugador 1 ");
            }else if(sumaNum2>sumaNum1) {
                System.out.println("el ganador es el jugador 2 ");
            }else if(sumaNum1==sumaNum2){
                System.out.println(" empate ");
        }
        }


    }else{
        System.out.println("Fuera de rango");
    }



    }
}