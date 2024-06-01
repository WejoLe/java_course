package timus.task_1014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List <Integer> list = new ArrayList<>();
        int n = in.nextInt();

        if(n == 0) {
            System.out.println(10);
            return;
        }
        else if (n == 1){
            System.out.println(1);
            return;
        }

        for (int i = 9; i > 1; i--) {

            while(n % i == 0){
                n /= i;
                list.add(i);
            }

        }

        if (n == 1) {
            for (int i = list.size(); list.size() != 0 ; i--) {
                System.out.print(list.get(list.size()-1));
                list.remove(list.size()-1);
            }
        }
        else {
            System.out.println(-1);
        }
    }
}
