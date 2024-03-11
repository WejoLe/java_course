package lr9.two.exemple.exemple6;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            System.out.println("Результат: " + convertToBinary(number));
        }

        private static String convertToBinary(int number) {
            if (number == 0) {
                return "0";
            } else if (number == 1) {
                return "1";
            } else {
                int remainder = number % 2;
                int quotient = number / 2;
                return convertToBinary(quotient) + remainder;
            }
        }
    }
