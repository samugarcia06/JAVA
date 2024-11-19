import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaramos variable de dni
        int inum ;



        System.out.println("Introduce un numero y te lo dire en letras");
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();

        if (inum>=0 && inum<100) {
            String[] unidades = {"", "uno", "dos", "tres", "quatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
            String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa", "cien"};
            String[] especiales = {"", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
            String iresultado = "";
            int idecena = inum / 10;
            int iunidad = inum % 10;

            if (idecena == 0) {
                iresultado = unidades[iunidad];

            } else if (idecena == 1) {
                if (iunidad == 0) {
                    iresultado = decenas[idecena];

                } else {
                    iresultado = especiales[iunidad];

                }
            } else {
                iresultado = decenas[idecena];
                if (iunidad != 0) {
                    iresultado += " y " + unidades[iunidad];
                }
                System.out.println(iresultado);
            }


        }else {
            System.out.println("El numero no es valido");
        }

        }

    }

