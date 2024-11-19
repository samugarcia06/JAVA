import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inum, imul = 0;
        System.out.println("introduce 1 numero entero");
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();
        if (inum < 11 && inum > 0) {
            for (int isol; imul<11 ; imul++  ) {
                isol=inum*imul;
                System.out.println(isol);
            }
        }else{
            System.out.println("introduce numero valido");
        }
    }
}