package yandrLearning.shildtTasks.part10.binaryStream;

import java.io.*;
//(char)((int) ch | 32)
public class FileComparison {
    public static final String ORIGIN = "D:\\Excel 2019. Библия пользователя\\примеры\\test.TXT";
    public static final String COPY = "D:\\Excel 2019. Библия пользователя\\примеры\\Copytest.TXT";

    public static void main(String[] args) {
        System.out.println(compareFilesIgnoreCase(ORIGIN, COPY));
        System.out.println(compareFiles(ORIGIN, COPY));
        System.out.println(getSymbNumCompareFiles(ORIGIN, COPY));

    }

    public static boolean compareFiles(String firstFile, String secondFile) {
        boolean result = true;
        try (FileInputStream streamF = new FileInputStream(firstFile);
             FileInputStream streamS = new FileInputStream(secondFile)) {
            for (int i = streamF.read(), j = streamS.read(); (i != -1 || j != -1) && result
                    ; i = streamF.read(), j = streamS.read()) {
                result = i == j;
            }
        } catch (IOException e) {
            System.out.println("IO error");
        }
        return result;
    }

    public static boolean compareFilesIgnoreCase(String firstFile, String secondFile) {
        boolean result = true;
        try (FileInputStream streamF = new FileInputStream(firstFile);
             FileInputStream streamS = new FileInputStream(secondFile)) {
            for (int i = streamF.read(), j = streamS.read(); (i != -1 || j != -1) && result
                    ; i = streamF.read(), j = streamS.read()) {
                result = (char) (i | 32) == (char) (j | 32);
            }
        } catch (IOException e) {
            System.out.println("IO error");
        }
        return result;
    }

    public static int getSymbNumCompareFiles(String firstFile, String secondFile) {
        boolean result = true;
        int count = 0;
        int i = 0;
        int j = 0;
        try (FileInputStream streamF = new FileInputStream(firstFile);
             FileInputStream streamS = new FileInputStream(secondFile)) {
            for (i = streamF.read(), j = streamS.read(); (i != -1 || j != -1) && result
                    ; i = streamF.read(), j = streamS.read()) {
                result = i == j;
                count++;
            }
        } catch (IOException e) {
            System.out.println("IO error");
        }
        return (i == -1 && j == -1) && result ? -1 : count;
    }
}
