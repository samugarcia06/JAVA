import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce una letra");
        Comprobacion();
    }

    public static char LeerVocal(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().charAt(0);
    }
    public static void Comprobacion(){
        char letra = LeerVocal();
        if(Character.isDigit(letra)){
            System.out.println("no es una letra");
        }else if(letra == 'a' || letra== 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("Es vocal");
        }else{
            System.out.println("No vocal");
        }
    }
}