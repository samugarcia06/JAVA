import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int inum1, inum2 ,inum3 ,inum4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        inum1 = scanner.nextInt();
        System.out.println("Dime otro numero: ");
        inum2 = scanner.nextInt();

        if(inum1 > inum2){
            System.out.println(inum1+">"+inum2);
        }else if(inum2 > inum1){
            System.out.println(inum2+">"+inum1);
        }else{
            System.out.println(inum2+"=="+inum1);
        }

        System.out.println("Dime otro numero");
        inum3 = scanner.nextInt();
        if(inum3 > inum2){
            System.out.println(inum3+">"+inum2);
        }else if(inum2 > inum3){
            System.out.println(inum2+">"+inum3);
        }else{
            System.out.println(inum2+"="+inum3);
        }

        System.out.println("Dime otro numero");
        inum4 = scanner.nextInt();
        if(inum4 > inum3){
            System.out.println(inum4+">"+inum3);
        }else if(inum3 > inum4){
            System.out.println(inum3+">"+inum4);
        }else{
            System.out.println(inum3+"="+inum4);
        }

        if(inum2 > inum1 && inum3>inum2 && inum4>inum3){
            System.out.println("Ordenado en orden ascendente :" + inum1+ "<" + inum2 +"<"+inum3+"<"+inum4);
        }

    }
}