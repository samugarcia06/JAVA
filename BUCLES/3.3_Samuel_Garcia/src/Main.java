import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variable , numero que introduce el usuario y el numero random
        int inum , irandom;
        Scanner sc = new Scanner(System.in);
        // generamos un numero aleatorio y lo igualamos a la variable
        irandom = (int) (Math.random() * 101);
        System.out.println("Prueba un numero");
        //leemos
        inum=sc.nextInt();
        //introducimos un bucle para ejecutar el juego y comprobar si el iramdon == inum
        while(inum!=irandom && inum<101 && inum>0 ){
            //pistas al usuario
            if (irandom>inum){
                System.out.println("el numero aleatorio es mayor");
            }else{
                System.out.println("el numero aleatorio es menor");
            }
            //le damos la opcion de rendirse
            System.out.println("Prueba de nuevo , -1 para rendirte");
            inum=sc.nextInt();
       }

        //acierta , falla o se rinde
        if(inum==irandom){
            System.out.println("enhorabuena , has acertado");
        }else if(inum==-1){
            System.out.println("te has rendido , el numero a adivinar era : " + irandom);
        }else{
            System.out.println("numero no valido");
        }
    }
}