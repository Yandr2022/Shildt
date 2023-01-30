package yandrLearning.shildtTasks.part14.tasks;

public class FactorialLambdaTest {
    public static void main(String[] args) {
        NumFunc factorial = (n) -> {
            int result = n == 0 ? 1 : n;
            for (int i = 1; i < n; i++) {
                result *= i;
            }
            return result;
        };
        for (int i = 0; i <= 10; i++) {
            System.out.println("factorial " + i + ": " + factorial.func(i));
        }

    }
}
interface NumFunc{
    int func(int n);
}
