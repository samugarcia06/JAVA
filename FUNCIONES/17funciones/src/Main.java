import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce primer numero");
        int inum1=LeerNum();
        System.out.println("Introduce segundo numero");
        int inum2=LeerNum();
        Divisor(inum1,inum2);
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }



    public static void Divisor(int inum1,int inum2){
        int sumaDivisor1=0;
        for(int i=1; i<=inum1/2; i++){
            if(inum1%i==0){
                sumaDivisor1+=i;

            }
        }
        int sumaDivisor2=0;
        for(int i=1; i<=inum2/2; i++){
            if(inum2%i==0){
                sumaDivisor2+=i;
            }
        }
        if(sumaDivisor1==inum2 && sumaDivisor2==inum1){
            System.out.println("Son amigos");

        }else{
            System.out.println("No son amigos");
        }
    }

}

