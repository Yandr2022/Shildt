package yandrLearning.shildtTasks.part8.interfaces;

public class InterfaceReferencesTest {
    public static void main(String[] args) {
        Series[]series = {new ByThrees(10),new ByTwos(10)};
        for (Series ser: series) {
            for (int i = 0; i < 10; i++) {
                System.out.print(ser.getNext() + " " );
            }
            System.out.println();
        }
    }
}
