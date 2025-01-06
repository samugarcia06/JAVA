import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce x1");
        int x1=LeerNum();
        System.out.println("Introduce x2");
        int x2=LeerNum();
        System.out.println("Introduce y1");
        int y1=LeerNum();
        System.out.println("Introduce y2");
        int y2=LeerNum();
        System.out.println(distancia(x1,x2,y1,y2) + "m");

    }
    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static double distancia(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}

