package lr11.task5;

import java.util.List;
import java.util.stream.Collectors;

public class Class5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк "+
                "и возвращает новый список, содержащий только те строки, "+
                "которые содержат заданную подстроку.";
        String substring = "строк";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования: " + "\n");
        for (String e : strings){
            System.out.println(e);
        }
        List<String> stringAfter = filterSubstring(strings, substring);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e: stringAfter) {
            System.out.println(e);}
    }
    public static List<String> filterSubstring(List<String> list, String substring){
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());}}
