import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inota=0 ,inum , icontador=0;
        System.out.println("Introduce 5 notas");
        Scanner sc = new Scanner(System.in);
        while(icontador<5){
            icontador++;
            inum=sc.nextInt();
            inum=inota;
        }
        if(inota<5){
            System.out.println("Hay suspensos");
        }
    }
}