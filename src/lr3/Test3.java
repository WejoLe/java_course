package lr3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = 1;
        int c = 1;

        System.out.println(c);

        while (b <= a){
            System.out.println(c);

            int j = b + c;
            b = c;
            c = j;
        }
    }
}
