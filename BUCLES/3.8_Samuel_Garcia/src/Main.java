import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inum , isuma=0 , imedia ,icontador=0;
        System.out.println("introduce 10 numero enteros");
        Scanner sc = new Scanner(System.in);

        while(icontador<10){
            icontador++;
            inum = sc.nextInt();
            isuma+=inum;
        }
        imedia=isuma/10;
        System.out.println(imedia);
    }
}