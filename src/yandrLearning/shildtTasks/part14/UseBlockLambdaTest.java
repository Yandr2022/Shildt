package yandrLearning.shildtTasks.part14;

import java.util.Random;

public class UseBlockLambdaTest {
    public static void main(String[] args) {
        Random random = new Random();

        NumericFunc smallestDiv = (n) -> {
            int result = 1;
            n = n > 0 ? n : -n;
            for (int i = 2; i <= n / i; i++) {
                if (n % i == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        for (int i = random.nextInt(200), count = 0; count <= 20; count++, i = random.nextInt(200)) {
            System.out.println(String.format("smallest divisor of %d is %d", i, smallestDiv.func(i)));
        }


    }
}
interface NumericFunc{
    int func(int n);
}