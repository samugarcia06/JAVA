import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos variable de dni
        int idni;
        //declaramos las letras con una cadena
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        //declaramos indice de letras para saber que numero responde a cada letra
        int indiceletra;
        //declaramos la letra del dni
        char letraDNI;
        System.out.println("Bienvenido a la calculadora dni");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte tu dni y te dire que letra te corresponde ");
        idni = sc.nextInt();

        if (idni>9999999 && idni<100000000 ) {
            indiceletra=idni%23;
            letraDNI = letras[indiceletra];
            System.out.println("tu dni es: " + idni + letraDNI);
        } else{
            System.out.println("Formato incorrecto");
        }
    }
}
