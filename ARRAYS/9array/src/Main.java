
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static int LeerNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void Menu() {
        int [] array1 = new int [5];
        int [] array2 = new int [5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Rellena array 1:");
            array1[i] = LeerNum();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Rellena array 2:");
            array2[i] = LeerNum();
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("Arrays ordenados:\n" + Arrays.toString(array1) + "\n" + Arrays.toString(array2));
        System.out.println("Array final ordenado\n"+Arrays.toString(fusion(array1, array2)));

    }
    public static int [] fusion (int [] array1 , int [] array2) {
        return IntStream.concat(IntStream.of(array1), IntStream.of(array2)).sorted().toArray();

    }

}