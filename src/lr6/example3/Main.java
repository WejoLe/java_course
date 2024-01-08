package lr6.example3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 11, 222, 3};

        int max = Test1.findMaxFromArray(numbers);
        int min = Test1.findMinFromArray(numbers);
        double average = Test1.findAverageFromArray(numbers);

        System.out.println("Наибольшее значение: " + max);
        System.out.println("Наименьшее значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}
