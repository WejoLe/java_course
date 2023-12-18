package lr3;

import java.util.Scanner;

public class Test2 {
        public static void main (String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");

        String day = in.nextLine();

        switch (day) {
            case "Понедельник":
                System.out.println("Первый день в неделе");
                break;
            case "Вторник":
                System.out.println("Второй день в неделе");
                break;
            case "Среда":
                System.out.println("Третий день в неделе");
                break;
            case "Четверг":
                System.out.println("Четвёртый день в неделе");
                break;
            case "Пятница":
                System.out.println("Пятый день в неделе");
                break;
            case "Суббота":
                System.out.println("Шестой день в неделе");
                break;
            case "Воскресенье":
                System.out.println("Седьмой день в неделе");
                break;
        }

        if (day.equals("Понедельник")) {

        } else if (day.equals("Вторник")) {

        } else if (day.equals("Среда")) {

        } else if (day.equals("Четверг")) {

        } else if (day.equals("Пятница")) {

        } else if (day.equals("Суббота")) {

        } else if (day.equals("Воскресенье")) {

        } else {
            System.out.println("Такого дня нет !");
        }
    }
}