package yandrLearning.shildtTasks.part14.tasks;

import java.math.BigInteger;

public class FactorialGenLambdaTest {
    public static void main(String[] args) {
        MyFunc<BigInteger> factorial = (n) -> {
            BigInteger result = (n == 0) ? BigInteger.ONE : BigInteger.valueOf(n);
            for (int i = 1; i < n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        };
        for (int i = 200; i <= 205; i++) {
            System.out.println("factorial " + i + ": " + factorial.func(i));
        }

    }
}
interface MyFunc<T extends Number>{
    T func(int n);
}