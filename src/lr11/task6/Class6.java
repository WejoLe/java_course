package lr11.task6;
import java.util.*;
import java.util.stream.Collectors;

public class Class6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int size = in.nextInt();
        int num = 15;
        List<Integer> list = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000));
        }
        System.out.println("Список list: ");
        System.out.println(list.stream().toList());

        List<Integer> listResult = filterDivNum(list, num);
        System.out.println("Список чисел которые делятся на "+num + ":");
        System.out.println(listResult.stream().toList());
    }
    public static List<Integer>  filterDivNum(List<Integer> list , int number){
        return list.stream().filter(n -> n % number == 0).
                collect(Collectors.toList());}}
