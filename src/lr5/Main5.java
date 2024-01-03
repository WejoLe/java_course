package lr5;

public class Main5 {
    public static void main(String[] args) {
        Test5.Example myexample = new Test5.Example(21);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set(15);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set(125);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set(-15);
        System.out.println("Число = " + myexample.PrintInt());

        myexample.Set();
        System.out.println("Число = " + myexample.PrintInt());
    }

}
