package timus.task_1083;

import java.util.Scanner;
class Factorial {
    int n;
    int k;
    Factorial(int n, String str){
        this.n = n;
        k = str.length();
    }
    int  factorial (int n){
        if(n <= 0) {
            return 1;
        }
        return factorial (n-k)*n;

    }
}
public class Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String k = in.next();

        Factorial fact = new Factorial(n, k);
        int result = fact.factorial(n);
        System.out.println(result);
    }
}
