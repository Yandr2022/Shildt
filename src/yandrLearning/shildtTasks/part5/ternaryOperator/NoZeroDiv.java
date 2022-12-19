package yandrLearning.shildtTasks.part5.ternaryOperator;

public class NoZeroDiv {
    public static void main(String[] args) {
        int result;
        for (int i = -5; i < 6; i++) {
            result = i == 0 ? 0 : 100 / i;
            System.out.println("100/" + i + " = " + result);

        }
    }
}
