import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce alto");
        int ialto=scanner.nextInt();
        System.out.println("Introduce ancho");
        int iancho=scanner.nextInt();
        int ianchoEstatico=iancho;
        //variables para controlar ancho y alto
        int i=0,j;

        //bucles
        while(i<ialto){
            System.out.println(" ");
            j=iancho--;
            while(j!=iancho){
                if(i<=iancho){
                    iancho=ianchoEstatico;
                }else{
                    System.out.print("*");
                    j++;
                }
            }
            i++;

        }

    }
}

