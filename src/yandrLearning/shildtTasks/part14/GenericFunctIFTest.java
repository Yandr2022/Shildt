package yandrLearning.shildtTasks.part14;

import java.util.Random;

public class GenericFunctIFTest {
    public static void main(String[] args) {
        Random random = new Random();
        SomeTest<Integer> integerSomeTest = (n, m) -> n % m == 0;
        SomeTest<Double> doubleSomeTest = (n, m) -> n % m == 0;
        SomeTest<String> stringSomeTest = (n, m) -> n.indexOf(m) != -1;
        System.out.println("Integer:");
        for (int num = random.nextInt(200), div = random.nextInt(20) + 1, count = 0; count <= 10
                ; count++, num = random.nextInt(200), div = random.nextInt(20) + 1) {
            System.out.println(String.format("%d is divisor of %d: %s", div, num, integerSomeTest.test(num, div)));
        }
        System.out.println("Double:");
        double num = 5.2;
        double div = 2.6;
        System.out.println(String.format("%.2f is divisor of %.2f: %s", div, num, doubleSomeTest.test(num, div)));
        num = 5;
        div = 1.2;
        System.out.println(String.format("%.2f is divisor of %.2f: %s", div, num, doubleSomeTest.test(num, div)));
        System.out.println("String:");
        String strA = "Java is Great!!!";
        String[] strB = {"av", "!!", "abc", "great", "qwe"};
        for (String str : strB) {
            System.out.println(String.format("'%s' contains '%s': %s", strA, str, stringSomeTest.test(strA, str)));
        }

    }
}

interface SomeTest<T> {
    boolean test(T n, T m);
}
