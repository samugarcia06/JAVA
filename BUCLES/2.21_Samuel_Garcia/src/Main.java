import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variable , numero que introduce el usuario y el numero random
        int inum ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero en grados");
        inum = sc.nextInt();

        if(inum>360){
            inum=inum%360;
            System.out.println("grados: " + inum);
        }else{
            System.out.println("grados: " + inum);
        }
        System.out.println("pasado a radianes = "+ ((double)(2*inum)/360) + "rad");
    }
}