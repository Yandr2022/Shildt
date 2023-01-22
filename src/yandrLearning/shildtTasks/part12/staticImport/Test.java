package yandrLearning.shildtTasks.part12.staticImport;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
// || import static java.lang.Math.*;
import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        double a = 4, b = 1, c = -3, x1, x2;

        double sqrt = sqrt(pow(b, 2) - 4 * a * c);
        x1 = (-b + sqrt) / (2 * a);
        x2 = (-b - sqrt) / (2 * a);
        out.println("first pow = " + x1 + "\nsecond pow = " + x2);

    }
}
