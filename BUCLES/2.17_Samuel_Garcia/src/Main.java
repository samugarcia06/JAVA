import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos variable de dni
        int icomidaDiaria, inumAnimales;
        float fcantxanimal;

        System.out.println("Cuantos kilos de comida tienes hoy");
        Scanner sc = new Scanner(System.in);
        icomidaDiaria = sc.nextInt();
        System.out.println("Cuantos animales tienes");
        inumAnimales = sc.nextInt();
        System.out.println("Cuantos kilos de comida come cada animal ");
        fcantxanimal = sc.nextFloat();


        if(icomidaDiaria!=0 && inumAnimales!=0 && fcantxanimal!=0) {

            if (icomidaDiaria >= inumAnimales * fcantxanimal) {
                System.out.println("Tiene comida suficiente");
            } else if (icomidaDiaria < inumAnimales * fcantxanimal) {
                fcantxanimal = icomidaDiaria / inumAnimales;
                System.out.println("No tiene comida suficiente , puedes darle como mucho a cada animal :");
            }

        } else {
            System.out.println("Formato erroneo");
        }
    }
}
