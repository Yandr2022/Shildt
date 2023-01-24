package yandrLearning.shildtTasks.part13;

public class MultiParametrGenericTest {
    public static void main(String[] args) {
        TwoGen<Integer, String> test = new TwoGen<Integer, String>(88, "test");
        test.showTypes();
        int t = test.getOb1();
        String v = test.getOb2();
        System.out.println(t + " " + v);

    }
}

class TwoGen<T, V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("type T: "+ob1.getClass().getName());
        System.out.println("type V: "+ob2.getClass().getName());

    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
