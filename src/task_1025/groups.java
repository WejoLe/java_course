package timus.task_1025;

import java.util.Scanner;

public class groups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ввод данных
        int K = in.nextInt();
        int mas [] = new int [K];

        for (int i = 0; i < K; i++) {
            mas[i] = in.nextInt();
        }
        //сортировка массива
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K-i-1; j++) {
                if(mas[j] > mas[j+1]){
                    int t = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = t;
                }
            }
        }

        int minValGroups = K / 2 + 1;
        int mans = 0;
        for (int i = 0; i < minValGroups; i++) {
            mans += mas[i] / 2 + 1;
        }

        System.out.println(mans);
    }
}
