import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE NUMERO");
        int inum=scanner.nextInt();
        while(inum<1){
            System.out.println("INTRODUCE NUMERO");
            inum=scanner.nextInt();
        }
        int isumaprimos=0;
        for(int i=1 ; i<=inum ; i++){
            if(i==2 || i==3 || i==5 || i==7){
                System.out.print(i);
                System.out.print(" ");
                isumaprimos++;
            }else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.print(i);
                System.out.print(" ");
                isumaprimos++;
            }

        }
        System.out.println(" ");
        System.out.println("numero de primos = " + isumaprimos);
    }
}