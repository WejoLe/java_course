package lr4;

public class Test1 {
    public static void main(String[] args) {

        int figure = 11;
        int j;
        int i;
        int z;

        for(i = 1; i <= figure; i++){
            System.out.println("Номер строки: " + i + " ");

            z = 0;

            for(j = -12; j < figure; j++){
                System.out.println("+");
                z = z + 1;
            }
            System.out.println("Количество символов в строке: " + z);
        }
    }
}
