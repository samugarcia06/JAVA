import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inum, icontfilas1=0 ,icontcolumna1=0, icontcolumna2;
        System.out.println("Introduce numero impar");
        inum = scanner.nextInt();
        int imedio=inum/2+1;
        if (inum % 2 != 0) {

            while(icontfilas1!=inum){

                System.out.println(" ");
                while(icontcolumna1<imedio){
                    icontcolumna1++;
                    System.out.print(icontcolumna1);
                }
                icontcolumna2=icontcolumna1;
                int idiv=icontcolumna2-inum/2;
                while(icontcolumna2!=idiv){
                    icontcolumna2--;
                    System.out.print(icontcolumna2);
                }

                icontfilas1++;

            }

        } else {
            System.out.println("introduce numero impar");
        }
    }
}

