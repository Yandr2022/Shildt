package yandrLearning.shildtTasks.part14;

public class UseMethodRef2 {
    static boolean numTest(Int_Predicate predicate, int n) {
        return predicate.test(n);
    }

    public static void main(String[] args) {
        MyIntNum intNum = new MyIntNum(12);
        MyIntNum intNum2 = new MyIntNum(16);

        Int_Predicate predicate = intNum::isFactor;
        int var = 3;
        System.out.println(String.format("%d is factor %d: %s", var, intNum.getN(), predicate.test(var)));
        predicate = intNum2::isFactor;
        System.out.println(String.format("%d is factor %d: %s", var, intNum2.getN(), predicate.test(var)));

        MyIntNumPredicate predicate1 = MyIntNum::isFactor;

        System.out.println("2 is factor 15: " + predicate1.test(new MyIntNum(15), 2));
        System.out.println("4 is factor 20: " + predicate1.test(new MyIntNum(20), 4));
    }

}

interface Int_Predicate {
    boolean test(int num);
}

interface MyIntNumPredicate {
    boolean test(MyIntNum intNum, int num);
}

class MyIntNum {
    private int n;

    MyIntNum(int n) {
        this.n = n;
    }

    int getN() {
        return n;
    }

    boolean isFactor(int v) {
        return n % v == 0;
    }

}