package lr3;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {

        Random rnd  = new Random();
        List<Integer> list = new ArrayList<Integer>();
        int number;

        for(int i = 1; i <= 20; i++){
            number = rnd.nextInt(100);
            while(list.contains(number)) {
                number = rnd.nextInt(100);
            }
            list.add(number);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
 /*   Напишите программу, в которой создается целочисленный
        массив, заполняется случайными числами и после этого значения элементов в
        массиве сортируются в порядке убывания значений. */
