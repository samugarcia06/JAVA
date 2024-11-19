import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce numero");
        int  inum ;
        inum = sc.nextInt();
        if(inum>=1000 && inum<=9999){
            while(inum>0){
                int idig=inum%10;

                switch (idig){
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                }
                inum/=10;
            }

        }else{
            System.out.println("no valid");
        }
    }
}