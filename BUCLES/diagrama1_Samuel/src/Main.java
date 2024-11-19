import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int inum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido al centro de ayuda ");
        System.out.println("Funciona el ordenador? 1(SI) 2(NO)");

        inum = sc.nextInt();

        if (inum==1){
            System.out.println("No lo toques");
            System.out.println("Sin problemas");
        }else{
            System.out.println("Lo tocaste? 1(SI) 2(NO)");
            inum=sc.nextInt();
            if(inum==1){
                System.out.println("La cagaste");
                System.out.println("Alguien lo sabe? 1(SI) 2(NO)");
                inum=sc.nextInt();
                if (inum==1){
                    System.out.println("Pobre imbecil");
                    System.out.println("Puedes culpar a alguien?");
                    inum=sc.nextInt();
                    if(inum==2){
                        System.out.println("Tendras problemas?");
                        inum=sc.nextInt();
                        if(inum==2){
                            System.out.println("Olvidate del tema");
                            System.out.println("Sin problemas");
                        }else{
                            System.out.println("Pobre imbecil");
                        }
                    }else{
                        System.out.println("Sin problemas");
                    }
                }else{
                    System.out.println("Escondelo");
                    System.out.println("sin problemas");
                }
            }else {
                System.out.println("Escondelo");
                System.out.println("Sin problemas");
            }
        }
    }
}

