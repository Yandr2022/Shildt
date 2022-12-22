package yandrLearning.shildtTasks.part5.arrays;

public class QTest {
    public static void main(String[] args) {
        char ch;
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        for (int i = 0; i <26 ; i++) {
            bigQ.put((char) ('A'+i));
        }
        for (int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Saving "+ (char)('Z'-i));
            smallQ.put((char) ('Z' - i));
        }
        for (int i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
