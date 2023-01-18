package yandrLearning.shildtTasks.part10.symbolStreams;

import java.io.*;

public class WriteReadLineToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader("D:\\testWriteToFile.txt"));
             FileWriter writer = new FileWriter("D:\\testWriteToFile.txt", true)) {
            StringBuilder s = new StringBuilder();
            for (String sApp = reader.readLine(); !sApp.equals("stop"); sApp = reader.readLine()) {
                s.append(sApp).append('\n');
            }
            writer.write(String.format("%s", s));
            StringBuilder i;
            for (i = new StringBuilder(fReader.readLine()); fReader.readLine() != null; i.append(fReader.readLine()));
            System.out.println(i);

        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }

}
