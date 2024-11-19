import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al contador de dias");
        System.out.println("Dime un numero 1-7 y te dire que dia de la semana es");
        //declaramos variable
        int inum;
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();

        switch (inum) {
            case 1:System.out.println("El numero " + inum + "pertenece a lunes");
            break;
            case 2:System.out.println("El numero " + inum + "pertenece a martes");
            break;
            case 3:System.out.println("El numero " + inum + " pertenece a miercoles");
            break;
            case 4:System.out.println("El numero " + inum + " pertenece a jueves");
            break;
            case 5:System.out.println("El numero " + inum + " pertenece a viernes");
            break;
            case 6:System.out.println("El numero " + inum + " pertenece a sabado");
            break;
            case 7:System.out.println("El numero " + inum + " pertenece a domingo");
            break;
            default:System.out.println("El numero " + inum + " no VALIDO");
        }
    }
}