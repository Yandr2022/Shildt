package yandrLearning.shildtTasks.part10.binaryStream;

import java.io.*;

public class RWDataTest {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.5;
        try (
                DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("D:\\testData.TXT"));
                DataInputStream inputStream = new DataInputStream(new FileInputStream("D:\\testData.TXT"))) {
            outputStream.writeInt(i);
            outputStream.writeDouble(d);
            outputStream.writeBoolean(i == d);
            StringBuilder builder = new StringBuilder();
            builder.append(inputStream.readInt());
            builder.append(inputStream.readDouble());
            builder.append(inputStream.readBoolean());
            System.out.println(builder);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error Data type");
        }
    }
}
