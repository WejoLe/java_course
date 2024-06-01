package timus.task_1887;

import java.util.Scanner;

public class BicyclesCodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] str1 = in.nextLine().toCharArray();
        char[] str2 = in.nextLine().toCharArray();

        for (int i = 0; i < 4; i++) {
            str1[i]-=48;
            str2[i]-=48;
        }

        int code1 = str1[0]*1000+str1[1]*100+str1[2]*10+str1[3];
        int code2 = str2[0]*1000+str2[1]*100+str2[2]*10+str2[3];
        int attempt = 0;
        boolean breaking = false;

        for (int i = 0; (attempt<=code1)|(attempt<=code2); i++) {
            if(i%2==0){
                if(attempt==code1){
                    breaking = true;
                    break;
                }
                else
                    attempt++;
            }
            else{
                if(attempt==code2){
                    breaking = true;
                    break;
                }
                else
                    attempt++;
            }
        }
        if(breaking){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
