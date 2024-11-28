import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero impar");
        int inum , i=0 , j=0;
        inum = sc.nextInt();
        System.out.println("lado: " + inum);
        while(inum%2!=0 && inum>0) {
            for (i = inum; i > 0; i--) {
                System.out.println(" ");
                for (j = inum; j > 0; j--) {
                    System.out.print("*");
                }
            }
        }
    }
}

//for(int i=inum ; i>0 ; i--){
//            for(int j=0 ; j<i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }