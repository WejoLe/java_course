package lr9.first.exemple.exemple5;

public class Recursion {
public static void main (String[] args){
    System.out.println(fact(5));
}

public static int fact(int n){
    if (n == 0){
        return 0;
            }else if (n == 1){
        return 1;
            }else{
        System.out.println("Calling fact(" + (n - 2) + ")");
        int result1 = fact(n - 2);
        System.out.println("Calling fact(" + (n - 1) + ")");
        int result2 = fact(n - 1);
        System.out.println("Returning " + (result1 + result2));
        return result1 + result2;
        }
    }
}
