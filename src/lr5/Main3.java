package lr5;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = id.nextInt();
        System.out.println("Введите num2");
        int int2 = id.nextInt();
        Test3.Example myexample1 = new Test3.Example();
        Test3.Example myexample2 = new Test3.Example(int1);
        Test3.Example myexample3 = new Test3.Example(int1,int2);
    }
}
