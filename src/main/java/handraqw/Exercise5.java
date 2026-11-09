package handraqw;

import java.util.Scanner;

public class Exercise5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 4) {

            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int[] arr = inputData();
                    double[] result = calculate(arr);
                    printResult(result);
                    break;

                case 2:
                    printInfo();
                    break;

                case 3:
                    printDeveloper();
                    break;

                case 4:
                    System.out.println("Выход из программы");
                    break;

                default:
                    System.out.println("Неверный пункт меню");
            }
        }
    }

    static int[] inputData() {

        int n;

        do {
            System.out.print("Введите количество чисел: ");
            n = scanner.nextInt();

            if (!checkData(n)) {
                System.out.println("Количество чисел должно быть больше 0");
            }

        } while (!checkData(n));

        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    static boolean checkData(int n) {
        return n > 0;
    }

    static double[] calculate(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            sum = sum + arr[i];
        }

        double average = sum / arr.length;

        double[] result = {min, max, sum, average};

        return result;
    }

    static void printResult(double[] result) {

        System.out.println("\nРезультаты:");
        System.out.println("Минимальное число: " + (int) result[0]);
        System.out.println("Максимальное число: " + (int) result[1]);
        System.out.println("Сумма: " + (int) result[2]);
        System.out.println("Среднее арифметическое: " + result[3]);
    }

    static void printMenu() {

        System.out.println("\n--- ГЛАВНОЕ МЕНЮ ---");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт: ");
    }

    static void printInfo() {

        System.out.println("Программа анализирует массив целых чисел.");
        System.out.println("Находит минимум, максимум, сумму");
        System.out.println("и среднее арифметическое.");
    }

    static void printDeveloper() {

        System.out.println("Разработчик: Боборахимов Мухаммад Мухидинович");
        System.out.println("Группа: РИ-250912");
    }
}