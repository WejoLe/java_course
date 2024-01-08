package lr6.example5;

public class Main {

        public static int SumOfSq(int n) {
            return (n * (n + 1) * (2 * n + 1)) / 6;
        }

        public static void main(String[] args) {
            int n = 5;

            int sum = SumOfSq(n);
            System.out.println("Сумма квадратов натуральных чисел от 1 до " + n + " равна " + sum);
        }
}
