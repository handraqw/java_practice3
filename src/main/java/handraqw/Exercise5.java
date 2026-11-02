package handraqw;

import java.util.Scanner;

public class Exercise5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while (choice != 4) {

            printMenu();

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice == 1) {

                    int[] arr = inputData();

                    if (checkData(arr)) {
                        double[] result = calculate(arr);
                        printResult(result);
                    }

                } else if (choice == 2) {
                    printInfo();

                } else if (choice == 3) {
                    printDeveloper();

                } else if (choice == 4) {
                    System.out.println("Выход из программы");

                } else {
                    System.out.println("Неверный пункт меню");
                }

            } else {
                System.out.println("Введите целое число");
                scanner.next();
            }
        }
    }

    static int[] inputData() {

        int n;

        while (true) {
            System.out.print("Введите количество чисел: ");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();

                if (n > 0) {
                    break;
                }

                System.out.println("Количество должно быть больше нуля.");

            } else {
                System.out.println("Введите целое число.");
                scanner.next();
            }
        }

        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {

            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }

            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    static boolean checkData(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Массив пуст.");
            return false;
        }

        return true;
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

        System.out.printf("Минимальное число: %.0f%n", result[0]);
        System.out.printf("Максимальное число: %.0f%n", result[1]);
        System.out.printf("Сумма: %.0f%n", result[2]);
        System.out.printf("Среднее арифметическое: %.2f%n", result[3]);
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
