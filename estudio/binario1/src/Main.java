import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero binario");
        int inum=scanner.nextInt();
        int isuma=0;
        int iexponente=0;
        int idigito;
        while(inum>0){
            idigito=inum%10;
            if(idigito!=0 && idigito!=1){
                System.out.println("introduce numero binario");
                inum=scanner.nextInt();
            }else{
                isuma+=idigito*Math.pow(2,iexponente);
                iexponente++;
            }
            inum/=10;
        }
        System.out.println("tu numero en decimal es:" + isuma);
    }
}
