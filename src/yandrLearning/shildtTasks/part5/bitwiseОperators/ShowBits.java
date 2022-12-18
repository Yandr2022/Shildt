package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class ShowBits {
    int numBits;

    public ShowBits(int numBits) {
        this.numBits = numBits;
    }

    void show(long value) {
        long mask = 1;
        mask <<= numBits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((mask & value) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
