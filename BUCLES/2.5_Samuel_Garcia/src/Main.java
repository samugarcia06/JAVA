import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //crear scaner para leer datos
        Scanner n1 = new Scanner(System.in);
        float Numero1 , Numero2;
        System.out.println("Inserte un numero ");
        Numero1 = n1.nextFloat();
        System.out.println("Inserte un numero ");
        Numero2 = n1.nextFloat();

        if (Numero1 > Numero2){
            System.out.println(Numero1 + " > " +Numero2);
        }else {
            System.out.println(Numero2+" > "+Numero1);
        }


    }
}