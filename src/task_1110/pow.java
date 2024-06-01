package timus.task_1110;

import java.util.*;

public class pow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int Y = in.nextInt();
        List result = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int num = 1;
            for (int j = 0; j < N; j++) {
                num*=i;
                num = num%M;
            }
            if(num == Y)
                result.add(i);
        }

        Collections.sort(result);

        if(result.isEmpty())
            System.out.println(-1);
        else{
            for (int i = 0; i < result.size(); i++) {
             System.out.print(result.get(i) + " ");
            }
        }
    }
}
