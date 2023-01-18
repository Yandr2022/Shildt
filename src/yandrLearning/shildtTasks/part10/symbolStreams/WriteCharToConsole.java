package yandrLearning.shildtTasks.part10.symbolStreams;

import java.io.*;

public class WriteCharToConsole {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(System.out,true)) {
            int i=10;
            double d = 20.5;
            writer.println(i);
            writer.println(d);
            writer.println(String.format("%d * %.2f = %.2f",i,d,(i*d)));
        }
    }
}
