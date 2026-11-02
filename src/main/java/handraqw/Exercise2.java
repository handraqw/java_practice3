package handraqw;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Массив должен содержать минимум 2 элемента");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxSum = arr[0] + arr[1];
        int index = 0;

        for (int i = 1; i < n - 1; i++) {

            int sum = arr[i] + arr[i + 1];

            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }

        System.out.println("Найденные элементы:");
        System.out.println(arr[index] + " " + arr[index + 1]);

        System.out.println("Индексы:");
        System.out.println(index + " " + (index + 1));

        scanner.close();
    }
}
