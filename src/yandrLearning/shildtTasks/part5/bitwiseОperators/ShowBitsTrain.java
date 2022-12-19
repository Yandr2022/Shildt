package yandrLearning.shildtTasks.part5.bitwiseОperators;

public class ShowBitsTrain {
    public static void main(String[] args) {

ShowBits bits = new ShowBits(8);
ShowBits bits2 = new ShowBits(32);
ShowBits bits3 = new ShowBits(64);
       int a = 123;
        System.out.print(a + " = ");
        bits.show(a);
        a=87987;
        System.out.print('\n'+a + " = ");
        bits2.show(a);
        bits.show(a);
        a=237658768;
        System.out.print('\n'+a + " = ");
        bits3.show(a);



//        int t;
//        byte val;
//        val = 32;
//        for (t = 128; t > 0; t /= 2) {
//            if ((val & t) != 0) System.out.print("1");
//            else System.out.print("0");
//        }
    }
}
