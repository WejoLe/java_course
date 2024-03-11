package lr9.seven.exemple;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        int n = 10;
        LinkedList<Integer> people = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        System.out.println("Оставшийся человек: " + people.get(0));
    }
}
// Использование LinkedList
