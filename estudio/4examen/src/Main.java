import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el alto de los triángulos: ");
        int alto = scanner.nextInt();
        System.out.print("Ingrese el ancho máximo de los triángulos: ");
        int ancho = scanner.nextInt();
            while(alto>0){
                for (int i =ancho; i >0; i--) {
                    for (int j = 0; j < i; j++) {
                    System.out.print("*");
                    }
                    System.out.println(" ");
                    alto--;
                    if (alto == 0) {
                    break;
                    }
                }
            }
        }
    }
