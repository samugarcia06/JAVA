import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int inum , ifactorial=1;
        System.out.println("introduce 1 numero entero");
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();
        for(int i=inum ; i>1 ; i--){
            ifactorial=ifactorial*i;
            System.out.println(ifactorial);
        }
       System.out.println("factorial es : " +ifactorial);
    }
}