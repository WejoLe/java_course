package lr3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели по счёту: ");
        int Week = in.nextInt();

            switch (Week) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
            }

            if (Week == 1) {

            } else if (Week == 2) {

            } else if (Week == 3) {

            } else if (Week == 4) {

            } else if (Week == 5) {

            } else if (Week == 6) {

            } else if (Week == 7) {

            } else {
                System.out.println("Такого дня недели по счёту нет !");
            }
        }
    }