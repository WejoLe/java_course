package lr11.task8;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Class8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int size = in.nextInt();
        int value = 500;
        List<Integer> list = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000));
        }

        System.out.println("Список list: ");
        System.out.println(list.stream().toList());

        List<Integer> listResult = filterDivNum(list, value);
        System.out.println("Список чисел которые больше "+value + ":");
        System.out.println(listResult.stream().toList());
    }
    public static List<Integer>  filterDivNum(List<Integer> list , int value){
        return list.stream().filter(n -> n > value).
                collect(Collectors.toList());}}
