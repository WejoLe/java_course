package lr7;

public class Main {
    public static void main(String[] args) {

        SuperClassTest superClassObject =
                new SuperClassTest("передал в конструктор суперкалсса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest SubClassObject1 =
                new SubClassTest("передал в конструктор подкалсса");
        String SubClassName = SubClassObject1.toString();
        System.out.println(SubClassName);

        SubClassTest SubClassObject2 =
                new SubClassTest("передал в конструктор подкласса", "где два параметра");
        String SubclassName2 = SubClassObject2.toString();
        System.out.println(SubclassName2);
    }
}
