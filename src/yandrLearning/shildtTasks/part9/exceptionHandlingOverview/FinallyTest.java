package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;

import static yandrLearning.shildtTasks.part9.exceptionHandlingOverview.UseFinally.genExc;

public class FinallyTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            genExc(i);
            System.out.println();
        }
    }
}

class UseFinally {
    public static void genExc(int num) {
        int[] arr = new int[2];
        System.out.println("Output: "+num);
        try {
            switch (num) {
                case 0:
                    arr[0] = 10/num;
                    break;
                case 1:
                    arr[4] = 4;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero attempt...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Element not found...");
        } finally {
            System.out.println("Exit from the block try");
        }
    }
}
