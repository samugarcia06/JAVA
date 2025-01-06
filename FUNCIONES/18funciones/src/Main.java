import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu();
        int iOpcion=LeerNum();
        opcion(iOpcion);
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void Menu(){
        System.out.println("Bienvenido al juego del azar");
        System.out.println("El juego consiste en adivinar un numero dentro de un rango");
        System.out.println("Pulsa(1) para nivel 1");
        System.out.println("Pulsa(2) para nivel 2");
        System.out.println("Pulsa(3) para nivel 3");
    }

    public static void opcion(int iOpcion){
        int minimo=1,maximo,contador;
        switch(iOpcion){
            case 1:
                maximo = 10;
                System.out.println("Rango:  1 - " + maximo);
                contador=3;
                System.out.println("Oportunidades:  " + contador);
                Ramdon(minimo,maximo,contador);
                break;
            case 2:
                maximo=50;
                System.out.println("Rango:  1 - " + maximo);
                contador=5;
                System.out.println("Oportunidades:  " + contador);
                Ramdon(minimo,maximo,contador);
                break;
            case 3:
                maximo=100;
                System.out.println("Rango:  1 - " + maximo);
                contador=7;
                System.out.println("Oportunidades:  " + contador);
                Ramdon(minimo,maximo,contador);
                break;
        }
    }

    public static void Ramdon(int minimo,int maximo,int contador){
        int ramdon= (int) (Math.random()*maximo);
        System.out.println("Adivina numero");
        int inumero =-1;
        while(inumero<minimo){
            inumero=LeerNum();
        }
        if(inumero==ramdon){
            System.out.println("Acierto");
        }
        for(int i=contador-1;i>0;i--) {
            System.out.println("Oportunidades restantes : " + i);
            if (inumero > ramdon) {
                    System.out.println("El numero es menor");
                    inumero = LeerNum();

            }else if (inumero < ramdon) {
                    System.out.println("El numero es mayor");
                    inumero = LeerNum();
            }
            if(i==1){
                    System.out.println("Numero correcto era : " + ramdon);
            }
        }
    }
}

