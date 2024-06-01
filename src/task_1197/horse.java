package timus.task_1197;

import java.util.Scanner;

public class horse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String tests [] = new String[N];
        for (int i = 0; i < N; i++) {
            tests[i] = in.nextLine();
        }

        for (int i = 0; i < N; i++) {
            switch (tests[i].charAt(0)){
                case 'a':
                case 'h':
                    switch (tests[i].charAt(1)){
                        case '1':
                        case '8':
                            System.out.println(2);
                            break;
                        case '2':
                        case '7':
                            System.out.println(3);
                            break;
                        default:
                            System.out.println(4);
                    }
                    break;
                case 'b':
                case 'g':
                    switch (tests[i].charAt(1)){
                        case '1':
                        case '8':
                            System.out.println(3);
                            break;
                        case '2':
                        case '7':
                            System.out.println(4);
                            break;
                        default:
                            System.out.println(6);
                    }
                    break;
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                    switch (tests[i].charAt(1)){
                        case '1':
                        case '8':
                            System.out.println(4);
                            break;
                        case '2':
                        case '7':
                            System.out.println(6);
                            break;
                        default:
                            System.out.println(8);
                    }
                    break;
            }
        }
    }
}
