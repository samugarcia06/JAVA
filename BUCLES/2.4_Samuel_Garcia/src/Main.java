import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //crear scaner para leer datos
        Scanner n1 = new Scanner(System.in);
        float NumDecimal;
        System.out.println("Inserte un numero decimal");
        NumDecimal = n1.nextFloat();

        if(NumDecimal<1 & NumDecimal>(-1) & NumDecimal!=0){
            System.out.println("El numero: " + NumDecimal + " es un numero casicero");
        } else {
            System.out.println("El numero: " + NumDecimal + " es un numero normal");
        }
    }
}