import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int inum1 , inum2;
        inum1= LeerNum();
        inum2= LeerNum();
        MostrarNum(inum1,inum2);
    }
    public static int LeerNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce numero");
        return scanner.nextInt();
    }

    public static void MostrarNum (int inum1, int inum2){
        if(inum1>inum2){
            for(int i=inum2; i<inum1; i++){
                System.out.print(i);
                System.out.print(" ");
            }
        }else if(inum1<inum2){
            for(int i=inum1; i<inum2; i++){
                System.out.print(i);
                System.out.print(" ");
            }
        }else{
            System.out.println("son iguales");
        }
    }

}