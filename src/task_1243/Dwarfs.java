package timus.task_1243;
import java.util.Scanner;
public class Dwarfs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        int result=0;
        while(number.length()>0){
            result*=10;
            result += (int)(number.charAt(0)-48);
            result = result % 7;
            number = number.substring(1, number.length());
        }
        System.out.println(result);
    }
}
