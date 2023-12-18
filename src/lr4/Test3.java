package lr4;

public class Test3 {
    public static void main(String[] args) {

        int [][] Array = new int[10][];

        Array[0] = new int[]{2};
        Array[1] = new int[]{2,2};
        Array[2] = new int[]{2,2,2};
        Array[3] = new int[]{2,2,2,2};
        Array[4] = new int[]{2,2,2,2,2};
        Array[5] = new int[]{2,2,2,2,2,2};
        Array[6] = new int[]{2,2,2,2,2,2,2};
        Array[7] = new int[]{2,2,2,2,2,2,2,2};
        Array[8] = new int[]{2,2,2,2,2,2,2,2,2};
        Array[9] = new int[]{2,2,2,2,2,2,2,2,2,2};

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(" " + Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
