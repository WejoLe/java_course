package lr4;

public class Test4 {
    public static void main(String[] args) {

        int [][] Array = new int[4][];

        Array[0] = new int[]{0};
        Array[1] = new int[]{1,2};
        Array[2] = new int[]{1,2,3};
        Array[3] = new int[]{1,2,3,4};

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(" " + Array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
