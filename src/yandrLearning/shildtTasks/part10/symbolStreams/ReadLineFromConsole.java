package yandrLearning.shildtTasks.part10.symbolStreams;

import java.io.*;
import java.util.Arrays;

public class ReadLineFromConsole {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("D:\\testConsole.txt",true)) {
            StringBuilder s = new StringBuilder();
            for (String sApp = reader.readLine(); !sApp.equals("stop"); sApp = reader.readLine()) {
                s.append(sApp).append('\n');
            }
            System.out.println(s);
            writer.write(String.format("%s", s));
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
