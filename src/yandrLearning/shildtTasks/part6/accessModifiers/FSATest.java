package yandrLearning.shildtTasks.part6.accessModifiers;

public class FSATest {
    public static void main(String[] args) {
        FailSoftArray array = new FailSoftArray(5, -1);
        for (int i = 0; i < array.length * 2; i++) {
            array.putValue(i, i * 10);
        }
        for (int i = 0; i < array.length * 2; i++) {
            System.out.print(array.getValue(i) != array.getErrVal() ? array.getValue(i) + " " : "");
        }

        for (int i = 0; i < array.length * 2; i++) {
            System.out.print(array.putValue(i, i * 5) ? "" : "\nWrong index " + i);
        }

        System.out.println();

        for (int i = 0; i < array.length * 2; i++) {
            System.out.print(array.getValue(i) != array.getErrVal() ? array.getValue(i) + " " : "\nWrong index " + i);
        }
    }
}
