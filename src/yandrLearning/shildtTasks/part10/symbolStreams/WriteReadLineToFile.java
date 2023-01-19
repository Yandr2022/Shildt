package yandrLearning.shildtTasks.part10.symbolStreams;

import java.io.*;

public class WriteReadLineToFile {
    public static void main(String[] args) {
        String filePath = "D:\\testWriteToFile.txt";
        writeToFile(filePath, true);
        readFromFile(filePath);
    }

    public static void writeToFile(String filePath, boolean added) {
        try (FileWriter writer = new FileWriter(filePath, added);
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            StringBuilder s = new StringBuilder();
            for (String sApp = reader.readLine(); !sApp.equals("stop"); sApp = reader.readLine()) {
                s.append(sApp).append('\n');
            }
            writer.write(String.format("%s", s));
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }

    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             PrintWriter writer = new PrintWriter(System.out, true)) {
            StringBuilder s = new StringBuilder();
            for (String sApp = reader.readLine(); sApp != null; sApp = reader.readLine()) {
                s.append(sApp).append('\n');
            }
            writer.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}
