package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class ShiftDemo {
    public static void main(String[] args) {
        int value = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 128; j > 0; j /= 2) {
                if ((value & j) != 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
            value <<= 1;
        }
        System.out.println();

        value = 128;
        for (int i = 0; i < 8; i++) {
            for (int j = 128; j > 0; j /= 2) {
                if ((value & j) != 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
            value >>= 1;
        }
    }
}
