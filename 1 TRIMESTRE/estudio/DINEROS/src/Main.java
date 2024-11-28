import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INTRODUCE NUMERO");
        int inum=scanner.nextInt();
        while(inum<0){
            System.out.println("no trabajamos con numero complejos");
            inum=scanner.nextInt();
        }
        for(int i=0; i*i<=inum;i++){
            System.out.println(i+" * "+i+" = " + i*i);
            if(i*i==inum){
                System.out.println("La raiz cuadrada de "+ inum + " = "+ i);
            }else{
                int iresto=inum-i*i;
                System.out.println("raiz = " +i + " y resto =  " + iresto);
            }
        }

    }
}