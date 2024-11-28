import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce ancho");
        int a=scanner.nextInt();
        while(a<2 || a>10){
            System.out.println("introduce ancho");
            a=scanner.nextInt();
        }
        System.out.println("introduce alto");
        int b=scanner.nextInt();
        while(b<2 || b>10){
            System.out.println("introduce alto");
            b=scanner.nextInt();
        }
        //variable para ir pintando
        int ayuda;
        //dibujamos la forma de la matriz ( un cuadrado)
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                //condiciones si la fila es impar o par
                if(i%2==0) {
                    ayuda = -i * j;
                }
                else{
                    ayuda=i * j;
                    System.out.print(" ");
                }
                System.out.print(ayuda);
            }
            System.out.println();
        }
    }
}


