package yandrLearning.shildtTasks.part10.binaryStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("D:\\Excel 2019. Библия пользователя\\примеры\\test.TXT")) {
            StringBuilder builder = new StringBuilder();
            for (int i = stream.read(); i != -1; i = stream.read()) {
                builder.append((char) i);
            }
            System.out.println(builder);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(("Input-Output Error"));
        }
//        FileInputStream stream = null;
//        try {
//            stream = new FileInputStream("D:\\Excel 2019. Библия пользователя\\примеры\\test.TXT");
//            StringBuilder builder = new StringBuilder();
//            for (int i = stream.read(); i != -1; i = stream.read()) {
//                builder.append((char) i);
//            }
//            System.out.println(builder);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            System.out.println(("Input-Output Error"));
//        } finally {
//            try {
//                if (stream != null) stream.close();
//            } catch (IOException e) {
//                System.out.println(" Error Stream close");
//            }
//        }
    }
}
