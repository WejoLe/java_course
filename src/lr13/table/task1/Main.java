package lr13.table.task1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("average = " + averagePos());
    }
    public static double averagePos(){
        while (true){
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Введите размер массива: ");

                int size = in.nextInt();
                if(size == 0)
                    throw new Exception("Размер массива = 0");
                int [] arr = new int[size];

                for (int i = 0; i < size; i++) {
                    System.out.print("Введите " + (i+1) + "-й элемент: ");
                    arr[i] = in.nextInt();
                }
                int countPos = 0;
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    if(arr[i] >= 0){
                        countPos++;
                        sum += arr[i];
                    }
                }
                if(countPos == 0 && size != 0)
                    throw new Exception("Нет положительных чисел");
                System.out.println("arr: " + Arrays.toString(arr));
                return sum/countPos;
            }catch (InputMismatchException mismatchException){System.out.println("Введите целое число");
        }catch (Exception exception){System.out.println(exception.getMessage());}}}}
