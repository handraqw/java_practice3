package handraqw;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise3 {

    public static int[] createArray(int[] A, int[] B) {

        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = Math.max(A[i], B[i]);
        }

        return C;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массивов: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Введите элементы массива A:");

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Введите элементы массива B:");

        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        int[] C = createArray(A, B);

        System.out.println("Массив C:");
        System.out.println(Arrays.toString(C));

        scanner.close();
    }
}
