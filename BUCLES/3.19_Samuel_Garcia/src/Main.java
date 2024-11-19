import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 100");
        int inum ,iprimos=0;
        inum = scanner.nextInt();
        for(int i=inum;i>0;i--) {
            if(i==2 || i==3 || i==5 || i==7) {
                System.out.print(i+",");
                iprimos++;
            }else if(i%2!=0 && i%3!=0 && i%7!=0 && i%5!=0){
                System.out.print(i+",");
                iprimos++;
            }
        }
        System.out.println(" ");
        System.out.println("numero primos :"+ iprimos);
    }
}