package lr12.task2;

public class MyThread1 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i+" ");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();}}}) ;
        t.start();
        t.join();}}
