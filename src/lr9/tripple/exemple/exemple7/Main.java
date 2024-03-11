package lr9.tripple.exemple.exemple7;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Введите элементы массива:");
            inputArray(array, 0);

            System.out.println("Массив:");
            outputArray(array, 0);
        }

        private static void inputArray(int[] array, int index) {
            if (index < array.length) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите элемент #" + (index + 1) + ": ");
                array[index] = scanner.nextInt();
                inputArray(array, index + 1);
            }
        }

        private static void outputArray(int[] array, int index) {
            if (index < array.length) {
                System.out.println("Элемент #" + (index + 1) + ": " + array[index]);
                outputArray(array, index + 1);
            }
        }
}
