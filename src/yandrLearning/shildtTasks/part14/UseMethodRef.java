package yandrLearning.shildtTasks.part14;

public class UseMethodRef {
    static boolean numTest(IntPredicate predicate, int n) {
        return predicate.test(n);
    }
    public static void main(String[] args) {
        boolean res = numTest(MyIntPredicates::isPrime, 17);
        System.out.println("17 is Prime Number: " + res);
        res = numTest(MyIntPredicates::isEven, 17);
        System.out.println("17 is Even Number: " + res);
        res = numTest(MyIntPredicates::isPositive, 17);
        System.out.println("17 is Positive Number: " + res);
    }

}

interface IntPredicate {
    boolean test(int num);
}

class MyIntPredicates {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}