package lr11.task9;

import java.util.LinkedList;
import java.util.List;

public class Class9 {
    public static void main(String[] args) {
        String string = "1Напишите 2функцию, 3которая 4принимает 5на 6вход 7список 8строк "+
                "9и возвращает 11новый список, 13содержащий только те строки, "+
                "которые содержат только буквы (без @цифр #и символов).;";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка после сплитования: " + "\n");
        for (String e : strings){
            System.out.println(e);
        }
        List<String> stringAfter = filterLetters(strings);

        System.out.println("\n" + "Строки состоящие только из букв\n");
        for (String e: stringAfter) {
            System.out.println(e);}
    }
    public static List<String> filterLetters(List<String> list){
        List<String> newList = new LinkedList<>();
        boolean onlyLetters;
        for (String str:list) {
            onlyLetters = true;
            for (int i = 0; i < str.length(); i++) {
                if(!Character.isLetter(str.charAt(i))){
                    onlyLetters = false;
                    break;
                }
            }
            if(onlyLetters == true){
                newList.add(str);
            }
        }
        return newList;
}}

