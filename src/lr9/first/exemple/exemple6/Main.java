package lr9.first.exemple.exemple6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception{
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1 , "BMW");
        map.put(2 , "Яблоко");
        map.put(3 , "Lada");
        map.put(4 , "Груша");
        map.put(5 , "Audi");
        map.put(6 , "Земляника");
        map.put(7 , "Клубника");
        map.put(8 , "Манго");
        map.put( 9 , "Mercedes");
        map.put(10 , "Крыжовник");
        map.put(11 , "Виноград");

        StringBuilder result = new StringBuilder();
        int product = 1;

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            if (key > 5) {
                if (key == 0) {
                    result.append(value).append(",");
                } else if (value.length() > 5) {
                    product *= key;
                }
            }
        }

        if (result.length() > 0) {
            System.out.println("Строки с ключами больше 5: " + result.toString());
        }

        if (product != 1) {
            System.out.println("Произведение ключей с длиной строки больше 5: " + product);
        }
    }
}
