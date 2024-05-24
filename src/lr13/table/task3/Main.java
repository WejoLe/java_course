package lr13.table.task3;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("sum = "+sumByteArr());
    }
    public static int sumByteArr(){
        while (true){
            try{Scanner in = new Scanner(System.in);
                System.out.print("Введите размер массива: ");
                int size = in.nextInt();
                int sum = 0;
                byte []arr = new byte[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Введите " + (i+1) + "-e число: ");
                    arr[i] = in.nextByte();
                    sum += arr[i];
                }
                System.out.println("arr: " + Arrays.toString(arr));
                return sum;
            }catch (InputMismatchException e){System.out.println(e);
            }catch (Exception e){System.out.println(e);}}}}
