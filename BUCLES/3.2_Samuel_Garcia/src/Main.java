import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //declaramos variables para la edad , el numero de alumnos
        // la suma de todas las edades y los mayores edad
        float  flmedia;
        int imayoresEdad=0 , iNumAlumnos=0 ,  isumaEdades=0 , iedad=1;

        do{
           iedad=111;
           while(iedad>110 || iedad<0) {
                System.out.println("Ingrese la edad: ");
                iedad = sc.nextInt();
                if(iedad>110 || iedad<0) {
                    System.out.println("edad incorrecta , rango valido (0-110)");
                }
            }

            if(iedad>=18){
                imayoresEdad++;
            }
            if(iedad>0){
                isumaEdades+=iedad;
                iNumAlumnos++;
            }
        }while(iedad>0);

        flmedia=(float)isumaEdades/iNumAlumnos;
        if (iNumAlumnos>0){
            System.out.println("Resultados:");
            System.out.println("Numero de alumnos : " +iNumAlumnos );
            System.out.println("Media aritmetica de edad : " +flmedia );
            System.out.println("Numero de mayores de edad : " +imayoresEdad);
        }

    }
}
