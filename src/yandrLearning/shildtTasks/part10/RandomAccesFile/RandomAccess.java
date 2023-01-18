package yandrLearning.shildtTasks.part10.RandomAccesFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {

        try (RandomAccessFile accessFile = new RandomAccessFile("D:\\random.txt", "rw")) {
            double[] nums = {1.5, 2.7, 102, 98.4, 156.87};
            for (double num:nums) {
                accessFile.writeDouble(num);
            }
            for (int i = 0; i < 40; i+=8) {
                accessFile.seek(i);
                System.out.println(String.format("%d value: %f", (i + 1) / 8, accessFile.readDouble()));
            }
            for (int i = 0; i < nums.length; i += 2) {
                accessFile.seek(i * 8);
                System.out.println(String.format("%d value: %.2f,", (i + 1) , accessFile.readDouble()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error Input");
        }
    }


}
