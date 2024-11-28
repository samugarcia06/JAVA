import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inum = sc.nextInt();
        int i=inum;
        while(i>0){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i--;
        }

    }
}