package lr6.example4;

public class Main {

        public static long calculateDoubleFactorial(int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("Число должно быть положительным.");
            }

            if (n == 1 || n == 2) {
                return n;
            }

            long result = 1;
            for (int i = n; i >= 2; i -= 2) {
                result *= i;
            }

            return result;
        }

        public static void main(String[] args) {
            int number = 6;
            long doubleF = calculateDoubleFactorial(number);
            System.out.println(number + "!! = " + doubleF);
        }
}