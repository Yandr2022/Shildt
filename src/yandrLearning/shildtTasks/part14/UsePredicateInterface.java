package yandrLearning.shildtTasks.part14;

import java.util.Random;
import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        Random random = new Random();
        for (int i = 0, number = random.nextInt(200); i <= 10; i++, number = random.nextInt(200)) {
            System.out.println(isEven.test(number) ? number + " even number" : number + " odd number");
        }
    }
}
