import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha correspondiente al día
        //siguiente.
        System.out.println("Bienvenido al calendario");
        System.out.println("Dime una fecha en formato dia ,mes y año");
        //declaramos variables
        int idia, imes, iano;
        boolean bOk = true;
        //declaramos scanner para leer la hora
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        idia = sc.nextInt();
        System.out.println("Ingrese el mes");
        imes = sc.nextInt();
        System.out.println("Ingrese el año");
        iano = sc.nextInt();
       //hacer de nuevo con switch

        switch(imes) {
            //meses con 31 dias
            case 1, 3, 5, 7, 8, 10, 12:
                if (idia < 31) {
                    //sumar un dia
                    idia++;
                } else if (idia == 31 && imes != 12) {
                    //sumar un mes
                    idia = 1;imes++;
                } else if (idia == 31 && imes == 12) {
                    //sumar un año
                    iano++;idia=1;imes=1;
                } else {
                    //fecha incorrecta
                    bOk = false;
                    System.out.println("error");
                }
                break;

            case 4, 6, 9, 11:
                if (idia < 30) {
                    //sumamos dia
                    idia++;
                } else if (idia == 30) {
                    //sumamos mes
                    imes++;idia=1;
                }else {
                    bOk = false;
                    System.out.println("fecha erronea");
                }
                break;

            case 2:
                if (idia < 28) {
                    //sumamos dia
                    idia++;
                } else if (idia == 28) {
                    //sumamos mes e igualamos dia a 1
                    imes++;idia=1;
                } else if (idia == 29 && iano % 4 == 0) {
                    //sumamos mes e igualamos dia a 1
                    imes++;idia=1;
                    System.out.println("el año es bisiesto");
                }
                else{
                    bOk = false;
                    System.out.println("fecha erronea");
                }
                break;

        }
        //condicion , si es verdadero muestra la feche corresponiente
        if(bOk!=false){
            System.out.println("fecha: "+idia+" / "+imes+" / "+iano);
        }
    }
}