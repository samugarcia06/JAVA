import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inum=0, irandom1, irandom2 , icontadorOperaciones=0 , resultado=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de la suma: ");

        while (inum == resultado) {
            irandom1 = (int) (Math.random() * 101);
            irandom2 = (int) (Math.random() * 101);
            resultado=irandom1 + irandom2 ;
            System.out.print(irandom1 +" + "+ irandom2 +" = ");
            inum = sc.nextInt();
            icontadorOperaciones++;

        }
        if(inum!=resultado) {
            System.out.println("El resultado es: " + resultado);
            System.out.println("Numero de operaciones : " + icontadorOperaciones);
        }


    }
}