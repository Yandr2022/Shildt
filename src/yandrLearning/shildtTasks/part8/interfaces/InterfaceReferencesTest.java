package yandrLearning.shildtTasks.part8.interfaces;

import java.util.Arrays;

public class InterfaceReferencesTest {
    public static void main(String[] args) {
        Series[] series = {new ByThrees(10), new ByTwos(10)};
        for (Series ser : series) {
            for (int i = 0; i < 10; i++) {
                System.out.print(ser.getNext() + " ");
            }
            ser.reset();
            System.out.println("\n" + Arrays.toString(ser.getNextArray(10)));
            System.out.println(Arrays.toString(ser.skipAndGetNextArray(10, 10))+"\n");
        }

    }
}
