package lr6.example3;

public class Test1 {

            public static int fMax(int... numbers) {
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                return max;
            }

            public static int fMin(int... numbers) {
                int min = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                return min;
            }

            public static double fAverage(int... numbers) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                return (double) sum / numbers.length;
            }

            public static int findMaxFromArray(int[] numbers) {
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                return max;
            }

            public static int findMinFromArray(int[] numbers) {
                int min = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                return min;
            }

            public static double findAverageFromArray(int[] numbers) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                return (double) sum / numbers.length;
            }
}
