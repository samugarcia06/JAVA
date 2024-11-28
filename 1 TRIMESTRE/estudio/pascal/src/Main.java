import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("introduce altura");
        int ifilas = leerNum(1);

        //piramide
        System.out.println("1");
        for (int n = 1; n <= ifilas; n++) {
            System.out.print("1");
            System.out.print(" ");
            int iResultado ;

            for (int m = 1; m <= n; m++) {
                iResultado = factorial(n) / (factorial(m) * factorial(n - m));
                System.out.print(iResultado +" ");
            }
            System.out.println(" ");
        }

    }
    public static int leerNum(int iMinimo) {
        Scanner sc = new Scanner(System.in);
        int ivalor = sc.nextInt();
        while (ivalor < iMinimo) {
            System.out.println("valor muy pequeño");
            System.out.println(" valor minimo " + iMinimo);
            ivalor = sc.nextInt();
        }
        return ivalor ;
    }

    public static int factorial(int iNumero) {
        int iResultado = 1;
        for (int i = 1; i <= iNumero; i++) {
            iResultado *= i;
        }
        return iResultado;
    }
}
