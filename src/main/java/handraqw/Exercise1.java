
package handraqw;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = 0;
        int right = n - 1;

        System.out.println("Результат:");

        while (left <= right) {

            System.out.print(arr[left] + " ");
            left++;

            if (left <= right) {
                System.out.print(arr[right] + " ");
                right--;
            }
        }

        scanner.close();
    }
}
