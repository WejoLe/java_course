package lr13;

public class Example1 {
    public static void main(String[] args) {
        try{
            System.out.println("O");
            throw new RuntimeException("Непроверяемая ошибка");
        }catch (RuntimeException e){
            System.out.println("1  " + e);
        }
        System.out.println("2");}}
