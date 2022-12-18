package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class LowCase {
    public static void main(String[] args) {

            char ch;
            for (int i = 0; i < 10; i++) {
                ch = (char) ('A'+ i);
                System.out.print(ch);
                ch = (char)((int) ch | 32);//00100000 setting the sixth bit
                System.out.print(ch + " ");

        }
    }
}
