import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al calendario");

        //declaramos variable y scanner
        int idia , imes , iano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia(Numerico)");
        idia = sc.nextInt();
        System.out.println("Dime un mes(Numerico)");
        imes = sc.nextInt();
        System.out.println("Dime un año(Numerico)");
        iano = sc.nextInt();

        //hacemos el programa con condicionales
        if (idia<32 && idia>0 && iano>500 && iano<5000 && imes == 1 || imes ==3 || imes ==5 || imes ==7 || imes ==9 || imes ==11 ) {
            System.out.println("La fecha es :"+ "  "+idia + "  " + imes + "  " + iano);
        }else if(idia<31 && idia>0 && iano>500 && iano<5000 && imes==4 || imes ==6 || imes ==8 || imes ==10 || imes==12) {
            System.out.println("La fecha es :" + " / "+idia + " / " + imes + " / " + iano);
        }else if(idia<29 && idia>0 && iano>500 && iano<5000 && imes==2 ){
            System.out.println("La fecha es :" + " "+idia + " / " + imes + " / " + iano);
        }else{
            System.out.println("La fecha es : erronea");
        }
    }

}