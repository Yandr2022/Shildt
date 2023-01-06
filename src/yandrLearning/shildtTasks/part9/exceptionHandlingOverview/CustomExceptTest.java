package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;

public class CustomExceptTest {
    public static void main(String[] args) {
        int[][] nums = {{4, 8, 16, 32, 64, 128, 215, 322}, {2, 0, 4, 4, 0, 3}};
        try {
            for (int i = 0; i < nums[0].length; i++) {
                try {
                    if (nums[0][i] % nums[1][i] != 0) throw new NonIntResultException(nums[0][i], nums[1][i]);
                    System.out.println(nums[0][i] + " / " + nums[1][i] + " = " + nums[0][i] / nums[1][i]);
                } catch (ArithmeticException e) {
                    System.out.println("Attempt to divide by zero!!!");
                } catch (NonIntResultException e) {
                    System.out.println(e);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Divider not found !!!!");
        }

    }
}

class NonIntResultException extends Exception {
    int a;
    int b;

    public NonIntResultException(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "The result of the operation " + a + " / " + b + " is not an integer";
    }
}
