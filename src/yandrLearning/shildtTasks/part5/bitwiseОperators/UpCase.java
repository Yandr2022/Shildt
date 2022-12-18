package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class UpCase {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a'+ i);
            System.out.print(ch);
            ch = (char)((int) ch & 65503);//1111111111011111 reset the sixth bit
            System.out.print(ch + " ");
        }
    }
}
