package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;
import static yandrLearning.shildtTasks.part9.exceptionHandlingOverview.Rethrow.genExc;

public class RethrowTest {
    public static void main(String[] args) {
        try {
            genExc();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Standard message: ");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

class Rethrow {
    public static void genExc() {
        int[][] nums = {{4, 8, 16, 32, 64, 128, 215, 322}, {2, 0, 4, 4, 0, 3}};
        for (int i = 0; i < nums[0].length; i++) {
            try {
                System.out.println(nums[0][i] + " / " + nums[1][i] + " = " + nums[0][i] / nums[1][i]);
            } catch (ArithmeticException e) {
                System.out.println("Attempt to divide by zero!!!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Divider not found !!!!");
                throw e;
            }
        }
    }
}