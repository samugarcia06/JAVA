import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        System.out.println("introduce 1 numero");
        int n=LeerNum();
        int resultado=Fibonacci(n);
        System.out.println(resultado);



    }
        public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
        }
        public static int Fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        }

    }