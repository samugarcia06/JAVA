import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int inum;
        Scanner sc = new Scanner(System.in);
        inum = sc.nextInt();
        for(int i=inum ; i>0 ; i--){
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}