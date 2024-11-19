import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu sueldo de 10.000 a 60.000");
        int isueldo=10001 ;
        double irpf , isumaSueldo=0 , isumaIrpf=0;

        while(isueldo>=10000 && isueldo<=60000){
            isueldo = sc.nextInt();

            if(isueldo>=10000 && isueldo<=30000){
                irpf= (isueldo*0.1);
                isumaIrpf+=irpf;
                isumaSueldo+=isueldo;
                System.out.println("sueldo: "+ isueldo + "  irpf: "+ irpf);
            }else if(isueldo>=30001 && isueldo<=50000){
                irpf= (isueldo*0.15);
                isumaIrpf+=irpf;
                isumaSueldo+=isueldo;
                System.out.println("sueldo: "+ isueldo + "  irpf: "+ irpf);
            }else if(isueldo>=50001 && isueldo<=60000){
                irpf= (isueldo*0.2);
                isumaIrpf+=irpf;
                isumaSueldo+=isueldo;
                System.out.println("sueldo: "+ isueldo + "  irpf: "+ irpf);
            }else{

                System.out.println("adios");
            }
            System.out.println("suma sueldo: " + isumaSueldo +"  suma irpf: " + isumaIrpf  );
        }
    }
}