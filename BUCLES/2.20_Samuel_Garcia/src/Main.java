import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variable , numero que introduce el usuario y el numero random
        int inum=0 , irandom1 , irandom2 ,iramdonOpcion , isolucion=0;
        Scanner sc = new Scanner(System.in);

        irandom1 = (int) (Math.random() * 100+1);
        irandom2 = (int) (Math.random() * 100+1);
        iramdonOpcion = (int) (Math.random() * 4);
        System.out.println("PRACTICA MATEMATICAS CON NUMEROS ENTEROS");

        switch(iramdonOpcion){
            case 0:
                isolucion = irandom1+irandom2;
                System.out.print(irandom1+"+"+irandom2 + "=");
                break;
            case 1:
                isolucion = irandom1-irandom2;
                System.out.print(irandom1+"-"+irandom2 + "=");
                break;
            case 2:
                isolucion = irandom1/irandom2;
                System.out.print(irandom1+"/"+irandom2 + "=");
                break;
            case 3:
                isolucion = irandom1*irandom2;
                System.out.print(irandom1+"*"+irandom2 + "=");
                break;
        }

        inum=sc.nextInt();

        if(inum==isolucion){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto , la solucion era "+ isolucion);
        }
    }
}