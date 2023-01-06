package yandrLearning.shildtTasks.part9.exceptionHandlingOverview;

import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Input letter");
        } catch (IOException e) {
            System.out.println("Error");
            ch = 'X';
        }
        System.out.println("You pressed a key " + ch);
    }

    public static char prompt(String s) throws IOException {
        System.out.print(s + ": ");
        return (char) System.in.read();
    }
}

