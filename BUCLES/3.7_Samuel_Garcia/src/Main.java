import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int imul=0 ,i=7 , isol=0;
        do{
            System.out.println(isol);
            isol=i*imul;
            imul++;
        }while(isol<100);
    }
}