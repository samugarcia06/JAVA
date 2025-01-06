import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        System.out.println("introduce 1 numero");
        int n=LeerNum();
        for(int i=1;i<=n;i++) {
            System.out.println(Fibonacci(i) + " ");
        }
    }
    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int Fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        }
        int fib_menos2=1;
        int fib_menos1=1;
        int fib=0;
        for(int i=2;i<=n;i++) {
            fib=fib_menos1+fib_menos2;
            fib_menos2=fib_menos1;
            fib_menos1=fib;
        }
            return fib;
        }
    }