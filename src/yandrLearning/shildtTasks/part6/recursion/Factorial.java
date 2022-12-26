package yandrLearning.shildtTasks.part6.recursion;

public class Factorial {
    static int factR(int n) {
        return n <= 1 ? 1 : factR(n - 1) * n;
    }

    static int factI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FactTest {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        for (int num : a) {
            System.out.println("Factorial " + num + " is " + Factorial.factR(num));
        }
        for (int num : a) {
            System.out.println("Factorial " + num + " is " + Factorial.factI(num));
        }

    }
}