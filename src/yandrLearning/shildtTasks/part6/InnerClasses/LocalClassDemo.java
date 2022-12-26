package yandrLearning.shildtTasks.part6.InnerClasses;

public class LocalClassDemo {
    public static void main(String[] args) {
        class ShowBits {
            int numBits;

            public ShowBits(int numBits) {
                this.numBits = numBits;
            }

            void show(long bits) {
                long mask = 1;
                mask <<= numBits - 1;
                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((bits & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if (spacer % 8 == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for (int i = 0; i < 10; i++) {
            ShowBits bits = new ShowBits(8);
            System.out.print(i + " in binary :");
            bits.show(i);
        }
    }
}
