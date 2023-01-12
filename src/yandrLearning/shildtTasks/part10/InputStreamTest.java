package yandrLearning.shildtTasks.part10;

import java.io.IOException;
import java.util.Arrays;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        byte[]data = new byte[10];
        System.out.print("input symbols: ");
        System.in.read(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }

    }
}
