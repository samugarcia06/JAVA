import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inum , icontador=0, iaprobados=0 , isuspensos=0 , icondicionados=0;
        System.out.println("Introduce 6 notas");
        Scanner sc = new Scanner(System.in);
        while(icontador<6){
            icontador++;
            inum=sc.nextInt();

            if(inum==4){
                icondicionados++;
            }else if(inum<5){
                isuspensos++;
            }else{
                iaprobados++;
            }
        }
        System.out.println("Total de notas: ");
        System.out.println("acondicionados : " +icondicionados + "suspensos : "+ isuspensos + " aprobados: " + iaprobados);
    }
}