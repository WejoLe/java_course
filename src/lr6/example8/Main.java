package lr6.example8;

public class Main {
        public static double getA(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            double average = (double) sum / array.length;
            return average;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            double average = getA(array);
            System.out.println("Среднее значение элементов массива: " + average);
        }
}
