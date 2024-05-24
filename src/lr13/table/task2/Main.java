package lr13.table.task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}};
        m(matrix);
    }
    public static void m (int[][]matrix){
        int size = matrix.length;
        System.out.println("Размер матрицы = " + size);
        while (true){
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите номер столбца: ");
                int number = in.nextInt() - 1;
                if(number < 0 || number > size){
                    throw new ArrayIndexOutOfBoundsException();
                }
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if(j == number)
                            System.out.println(matrix[i][j]);}
                }
                break;
            }catch (InputMismatchException e){System.out.println("Введите целое число");
            }catch (IndexOutOfBoundsException e){System.out.println("Такого столбца не существует");}}}}
