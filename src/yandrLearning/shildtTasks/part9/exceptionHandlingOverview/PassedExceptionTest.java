package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;

public class PassedExceptionTest {
    public static void main(String[] args) {
        try {
            genExc();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds array !");
        }
        System.out.println("After catch statement");
    }

    static void genExc() {
        int[] test = new int[4];
        System.out.println("Until an exception is thrown");
        test[7] = 10;
        System.out.println("This line will not be displayed");
    }
}
