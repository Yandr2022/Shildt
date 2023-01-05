package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;

public class SimpleExExcTest {
    public static void main(String[] args) {
        int []test =new int[4];
        try{
            System.out.println("Until an exception is thrown");
            test[7] = 10;
            System.out.println("This line will not be displayed");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Out of bounds array !");
        }
        System.out.println("After catch statement");
    }
}
