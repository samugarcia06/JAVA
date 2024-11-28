import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inum = sc.nextInt();
        int iprimos=0;
        while (inum>0) {
            if(inum==1 ||inum==2 || inum==3 || inum==5 || inum==7 ) {
                iprimos++;
            }else if(inum%2!=0 && inum%3!=0 && inum%5!=0 && inum%7!=0){
                iprimos++;
            }
            inum--;

        }
        System.out.println(iprimos);
    }
}