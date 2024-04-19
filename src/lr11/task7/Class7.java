package lr11.task7;

import java.util.List;
import java.util.stream.Collectors;

public class Class7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк "+
                "и возвращает новый список, содержащий только те строки, "+
                "которые имеют длину больше заданного значения.";
        int value = 8;

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования: " + "\n");
        for (String e : strings){
            System.out.println(e);
        }
        List<String> stringAfter = filterValue(strings, value);

        System.out.println("\n" + "Строки длиннее " + value+  " символов\n");
        for (String e: stringAfter) {
            System.out.println(e);}
    }
    public static List<String> filterValue(List<String> list, int value){
        return list.stream()
                .filter(s -> s.length()>value)
                .collect(Collectors.toList());}}
