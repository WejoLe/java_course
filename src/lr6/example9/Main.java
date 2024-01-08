package lr6.example9;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'П', 'о', 'к', 'а', '!'};

        swapArrayElements(arr);

        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void swapArrayElements(char[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }
}
