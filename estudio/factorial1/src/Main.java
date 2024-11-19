import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int icontador=0 ,impar=1,isuma=0;
        while(icontador<11){
            isuma+=impar;
            System.out.println(isuma);
            impar+=2;
            icontador++;

        }
    }
}
