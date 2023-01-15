package yandrLearning.shildtTasks.part10.binaryStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryDataTest {
    public static final String ORIGIN = "D:\\Excel 2019. Библия пользователя\\примеры\\test.TXT";
    public static final String COPY = "D:\\Excel 2019. Библия пользователя\\примеры\\Copytest.TXT";

    public static void main(String[] args) {
        copyAllFile(ORIGIN, COPY, false);
    }

    public static void copyAllFile(String origin, String copy, boolean added) {
        try (
                FileInputStream inputStream = new FileInputStream(origin);
                FileOutputStream outputStream = new FileOutputStream(copy, added)) {
            for (int i = inputStream.read(); i != -1; i = inputStream.read()) {
                outputStream.write((char) i);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File not found");
        } catch (
                IOException e) {
            System.out.println(("Input-Output Error"));
        }
    }

}
