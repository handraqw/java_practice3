package handraqw;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int m = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Элементы чётных строк:");

        for (int i = 1; i < m; i += 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
