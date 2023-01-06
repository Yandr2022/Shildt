package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;

public class GroupCatchTest {
    public static void main(String[] args) {
        int a = 0, b = 88, result;
        String str = "ABC";

        for (int i = 0; i < 2; i++) {
            try {
                result = i == 0 ? b / a : 0;
                str = i == 1 ? str.substring(4) : str;
            } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
                System.out.println("caught: " + e);
            }

        }
    }
}
