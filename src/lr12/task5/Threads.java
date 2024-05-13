package lr12.task5;
import java.util.Arrays;
import java.util.Random;

public class Threads {
    private static final Object lock = new Object();
    private static int max, i = 0;

    public static void main(String[] args) throws InterruptedException{
        int size = 20;
        int [] arr = new int[size];
        Random random = new Random();
        for (int j  = 0; j < size; j++) arr[j] = random.nextInt(1000);

        max = arr[0];
        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr)+"\n");

        Thread t1 = new Thread (() -> {
            synchronized (lock){
                while(i < size){
                    System.out.println(Thread.currentThread().getName() + ", i = "+i + ", max = " + max);
                    if(arr[i] > max) max = arr[i];
                    i++;
                    try{lock.notifyAll();if(i==size) break;lock.wait();
                    }catch (InterruptedException e){e.printStackTrace();}}}}
        );
        Thread t2 = new Thread (() -> {
            synchronized (lock){
                while(i < size){
                    System.out.println(Thread.currentThread().getName() + ", i = "+i + ", max = " + max);
                    if(arr[i] > max){
                        max = arr[i];
                    }
                    i++;
                    try{
                        lock.notifyAll();
                        if(i==size)
                            break;
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t3 = new Thread (() -> {
            synchronized (lock){
                while(i < size){
                    System.out.println(Thread.currentThread().getName() + ", i = "+i + ", max = " + max);
                    if(arr[i] > max){
                        max = arr[i];
                    }
                    i++;
                    try{
                        lock.notifyAll();
                        if(i==size)
                            break;
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t4 = new Thread (() -> {
            synchronized (lock){
                while(i < size){
                    System.out.println(Thread.currentThread().getName() + ", i = "+i + ", max = " + max);
                    if(arr[i] > max){
                        max = arr[i];
                    }
                    i++;
                    try{
                        lock.notifyAll();
                        if(i==size)
                            break;
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t5 = new Thread (() -> {
            synchronized (lock){
                while(i < size){
                    System.out.println(Thread.currentThread().getName() + ", i = "+i + ", max = " + max);
                    if(arr[i] > max){
                        max = arr[i];
                    }
                    i++;
                    try{
                        lock.notifyAll();
                        if(i==size)
                            break;
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t6 = new Thread (() -> {
            synchronized (lock){
                while(i < size){
                    System.out.println(Thread.currentThread().getName() + ", i = "+i + ", max = " + max);
                    if(arr[i] > max){
                        max = arr[i];
                    }
                    i++;
                    try{
                        lock.notifyAll();
                        if(i==size)
                            break;
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start(); t2.start(); t3.start();
        t4.start(); t5.start(); t6.start();

        t1.join(); t2.join(); t3.join();
        t4.join(); t5.join(); t6.join();
        System.out.println("\nmax = " + max);}}
