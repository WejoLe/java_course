package timus.task_1225;


import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long values [] = new long[N];
        for (int i = 0; i < N; i++) {
            if(i == 0 | i == 1){
                values[i] = 2;
                continue;
            }
            values[i] = values[i-2]+values[i-1];
        }
        System.out.println(values[N-1]);
    }    
}
