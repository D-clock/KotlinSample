package lesson1;

/**
 * Created by Clock on 2017/6/18.
 */
public class Lesson1 {

    public static int javaInt = 0;

    public static Lesson1 getInstance() {
        return new Lesson1();
    }

    public static void main(String[] args) {
        int id = 1;
        String name = "D_clock爱吃葱花";
        final int useFinal = 1000;

        useIf();

    }

    public static void useIf() {
        int a = 5;
        int b = 3;
        boolean result;
        if (a > b) {
            System.out.println("a > b");
            result = true;
        } else {
            System.out.println("a <= b");
            result = false;
        }
        System.out.println("result: " + result);
    }

    public String getName() {
        return "Java";
    }

    public void displayName(String name) {
        System.out.println("name: " + name);
    }

    public void displayActors(String... name) {
        System.out.println("actors :" + name);
    }

}