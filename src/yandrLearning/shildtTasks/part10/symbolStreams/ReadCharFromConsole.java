package yandrLearning.shildtTasks.part10.symbolStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharFromConsole {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char c = 0;
            while (c != '.') {
                c = (char) reader.read();
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
