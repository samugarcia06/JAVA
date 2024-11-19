import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int iopcion;
        System.out.println("DECIMAL-BINARIO PULSE 1");
        System.out.println("BINARIO-DECIMAL PULSE 2");
        Scanner sc = new Scanner(System.in);
        iopcion = sc.nextInt();

         if (iopcion == 1) {
            int isol, inum;
            System.out.println("introduce el numero en decimal");
            inum = sc.nextInt();
            while (inum != 0) {
                isol = inum % 2;
                if (isol == 0) {
                    System.out.println("digito : 0");
                } else {
                    System.out.println("digito : 1");
                }
                inum = inum / 2;

            }
        } else if (iopcion == 2) {
            System.out.println("introduce el numero en binario");
            Scanner scanner =new Scanner(System.in);
            String binario = scanner.nextLine();
            int decimal = 0 , potencia = 0 ;
            char digito;

            // Iterar sobre los dígitos de derecha a izquierda
            for(int i=binario.length()-1; i>=0; i--) {
                digito=binario.charAt(i);
                if(digito=='1') {
                    decimal+=Math.pow(2,potencia);
                    potencia++;
                }else if(digito=='0') {
                    decimal-=Math.pow(0,potencia);
                    potencia++;
                }else{
                    System.out.println("numero no binario");
                }
            }
            System.out.println("El número decimal equivalente es: " + decimal);
        } else {
            System.out.println("Valor incorrecto");
        }
    }
}