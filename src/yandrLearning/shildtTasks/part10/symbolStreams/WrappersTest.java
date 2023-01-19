package yandrLearning.shildtTasks.part10.symbolStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrappersTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str;
            int n;
            double sum = 0, temp;
            System.out.println("Input numbers or 'avg' for calculating");
            for (str = reader.readLine(), n = 0; !str.equals("avg"); str = reader.readLine()) {
                try {
                    temp = Double.parseDouble(str);
                } catch (NumberFormatException exc) {
                    System.out.println("Wrong format");
                    continue;
                }
                n++;
                sum += temp;
            }
            System.out.println(String.format("Average = %.2f", sum / n));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
