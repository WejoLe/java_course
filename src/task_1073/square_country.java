package timus.task_1073;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class square_country {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        List <Integer> sqrs = new ArrayList<>();

        for (int i = 1; i < 245; i++) {
            if(i*i <= N) {
                sqrs.add(i * i);
            }
            else
                break;
        }

        for (int i = 0; i < sqrs.size(); i++) {
            if(sqrs.get(i) == N){
                System.out.println(1);
                return;
            }
        }

        for (int i = 0; i < sqrs.size(); i++) {
            for (int j = 0; j < sqrs.size(); j++) {
                if(sqrs.get(i) + sqrs.get(j) == N){
                    System.out.println(2);
                    return;
                }
            }
        }

        for (int i = 0; i < sqrs.size(); i++) {
            for (int j = 0; j < sqrs.size(); j++) {
                for (int k = 0; k < sqrs.size(); k++) {
                    if((sqrs.get(i) + sqrs.get(j) + sqrs.get(k)) == N){
                        System.out.println(sqrs.get(i) + " " +sqrs.get(j) +" "+ sqrs.get(k));
                        System.out.println(3);
                        return;
                    }
                }
                }
            }
        System.out.println(4);

    }
}

        //int c = 0;
        //int root = 0;
//        while (N != 0) {
//            for (int i = 1; i < 245; i++) {
//                if (i * i <= N) {
//                    root = i * i;
//                } else
//                    break;
//            }
//            N -= root;
//            c++;
//        }
//        System.out.println(c);



