import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double dblMillas , iCambio=1.6 , ikm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor en millas: ");
        dblMillas = scanner.nextDouble();

        if(dblMillas>0){
            ikm=dblMillas*iCambio;
            System.out.println(ikm + " km ");

        }else{
            System.out.println("El valor ingresado no es valido");
        }
    }
}