package yandrLearning.shildtTasks.part3;

import java.io.IOException;

// Чтение символа с клавиатуры
public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.print("Press the selected key and then ENTER key: ");
        ch = (char) System.in.read();
        System.out.println(ch);
    }
}
