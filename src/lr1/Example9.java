package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ввод числа месяца
        System.out.println("Input Day of the month: ");
        int daysmonth = in.nextInt();

        if (daysmonth == 1){
            System.out.println("Январь");
        } else if (daysmonth == 2) {
            System.out.println("Февраль");
        } else if (daysmonth == 3){
            System.out.println("Март");
        }else if (daysmonth == 4) {
            System.out.println("Апрель");
        }else if (daysmonth == 5) {
            System.out.println("Май");
        }else if (daysmonth == 6) {
            System.out.println("Июнь");
        }else if (daysmonth == 7) {
            System.out.println("Июль");
        }else if (daysmonth == 8) {
            System.out.println("Август");
        }else if (daysmonth == 9) {
            System.out.println("Сентябрь");
        }else if (daysmonth == 10) {
            System.out.println("Октябрь");
        }else if (daysmonth == 11) {
            System.out.println("Ноябрь");
        }else if (daysmonth == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Такого месяца нет");
        }
        in.close();
    }
}
