import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] trimestre1 =new int[5];
        int [] trimestre2 =new int[5];
        int [] trimestre3 =new int[5];
        LeerAlumnos(trimestre1 , trimestre2 , trimestre3);
        MediaTrimestre(trimestre1, trimestre2, trimestre3);
        MediaAlumnos(trimestre1 , trimestre2 , trimestre3);
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void LeerAlumnos(int[] trimestre1 , int [] trimestre2 , int [] trimestre3) {
        System.out.println("1 TRIMESTRE");
        for (int i = 0; i < trimestre1.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i+1) + " : ");
            trimestre1[i] = LeerNum();
        }
        System.out.println("2 TRIMESTRE");
        for (int i = 0; i < trimestre2.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i+1) + " : ");
            trimestre2[i] = LeerNum();
        }
        System.out.println("3 TRIMESTRE");
        for (int i = 0; i < trimestre3.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i+1)+ " : ");
            trimestre3[i] = LeerNum();
        }
    }

    public static void MediaTrimestre(int[] trimestre1 , int [] trimestre2 , int [] trimestre3) {
        System.out.print("Media 1 trimestre : ");
        int suma1=0,suma2=0,suma3=0;
        for (int media1 : trimestre1) {
            suma1+=media1;
        }
        System.out.println(suma1/trimestre1.length);
        System.out.print("Media 1 trimestre : ");
        for (int media2 : trimestre2) {
            suma2+=media2;
        }
        System.out.println(suma2/trimestre2.length);
        System.out.print("Media 1 trimestre : ");
        for (int media3 : trimestre3) {
            suma3+=media3;
        }
        System.out.println(suma3/trimestre3.length);
    }
    public static void MediaAlumnos(int[] trimestre1 , int [] trimestre2 , int [] trimestre3) {

        int numeroAlumno  = -1;
        while(numeroAlumno>5 || numeroAlumno<0) {
            for(int i=0;i<trimestre1.length;i++) {
                System.out.println("Que alumno quieres saber del 1 al 5 :");
                numeroAlumno = LeerNum();
                int mediaAalumno = (trimestre1[numeroAlumno-1]+trimestre2[numeroAlumno-1]+trimestre3[numeroAlumno-1])/3;
                System.out.println("La media del alumno de todos los trimestres es : " + mediaAalumno);
            }
        }
    }
}