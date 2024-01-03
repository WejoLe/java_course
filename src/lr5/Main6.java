package lr5;

public class Main6 {
    public static void main(String[] args) {
        Test6.Example myexample = new Test6.Example(2, 5);
        myexample.PrintInt();
        Test6.Example myexample1= new Test6.Example(1);
        myexample1.PrintInt();
        myexample.SetInt(3, 15);
        myexample.PrintInt();
        myexample.SetInt(-9);
        myexample.PrintInt();
    }
}
