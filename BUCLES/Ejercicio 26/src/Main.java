import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int iseg , imin=0 , ihora=0;
        System.out.println("Introduce un tiempo en segundos");
        Scanner scanner = new Scanner(System.in);
        iseg = scanner.nextInt();
        if(iseg>0) {
            imin = iseg / 60;
            ihora = iseg / 3600;
            System.out.println(imin+" minutos " +ihora + " horas" );
        }else{
            System.out.println("El tiempo no puede ser negativo");
        }


    }
}