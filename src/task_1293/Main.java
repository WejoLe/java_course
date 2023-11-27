package task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();

        int result = (N * (A*B)) * 2;

        out.println(result);
        out.flush();
    }
}
