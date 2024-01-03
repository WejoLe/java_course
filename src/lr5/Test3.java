package lr5;

public class Test3 {
    static class Example {
        private int num1;
        private int num2;

        Example(){
            System.out.println("Koнcтpyиpoвaниe объекта test Example(1)\n");
        }
        Example(int num1){
            System.out.println("Koнcтpyиpoвaниe объекта Example(2)");
            this.num1 = num1;
            System.out.println("num1^num1 = "+exponentOwnPow (num1)+"\n");
        }
        public int exponentOwnPow (int num1) {
            this.num1 = num1;
            int result=1;
            for (int i=1; i <= num1;i++) {
                result = num1*result;
            }
            return result;
        }
        Example(int num1, int num2){
            System.out.println("Koнcтpyиpoвaниe объекта Example(3)");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("num1^num2 = "+exponentPow (num1,num2)+"\n");
        }
        public int exponentPow(int n1, int n2){
            n1 = num1;
            n2 = num2;
            int result=1;
            for (int i=1; i <= num2;i++) {
                result = num1*result;
            }
            return result;
        }
    }
}
